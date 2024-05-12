package cl.javiera.transaccion.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cl.javiera.shared.model.dao.DAO;
import cl.javiera.transaccion.model.entity.Transaccion;

/**
 * Implementación de la interfaz TransaccionDAO que proporciona acceso a datos para la entidad Transaccion
 */
public class TransaccionDAOImpl extends DAO implements TransaccionDAO{

	/**Constructor que establece la conexion a la base de datos*/
	public TransaccionDAOImpl() {
		this.conectarDb();
	}
	
	@Override
	public int guardar(Transaccion transaccion) {
		String sql = "insert into transaccion (id_cuenta, fecha_transaccion, monto, id_tipo)";
		sql+="values('"+transaccion.getId_cuenta()+"','"+transaccion.getFecha_transaccion()+"','"+transaccion.getMonto()+"','"+transaccion.getId_tipo()+"')";
		return this.ejecutarSql(sql);
	}

	@Override
	public List<Transaccion> getListado(int id) {
		List<Transaccion> listado = new ArrayList<>();
		try {
			String sql = "select t.id_transaccion, t.fecha_transaccion, t.monto, tt.nombre_tipo ";
			sql+="from transaccion t inner join tipo_transaccion tt ON t.id_tipo = tt.id_tipo ";
			sql+="where id_cuenta = "+id+" order by t.id_transaccion desc";
			ResultSet rsl = this.consultar(sql);
			
			while(rsl.next()) {
				int id_t =rsl.getInt("id_transaccion");
				Date fecha = rsl.getDate("fecha_transaccion");
				int monto=rsl.getInt("monto");
				String n_tipo=rsl.getString("nombre_tipo");
				
				Transaccion transaccion = new Transaccion(id_t,fecha,monto,n_tipo);
				
				listado.add(transaccion);
			}
			return listado;
		}catch(SQLException e) {
			return null;
		}
		
	}

}
