package cl.javiera.cuenta.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cl.javiera.cuenta.model.entity.Cuenta;
import cl.javiera.shared.model.dao.DAO;

/**
 * Implementación de la interfaz CuentaDAO que proporciona acceso a datos para la entidad Cuenta
 */
public class CuentaDAOImpl extends DAO implements CuentaDAO{
	
	/**Constructor que establece la conexion a la base de datos*/
	public CuentaDAOImpl() {
		this.conectarDb();
	}
	
	@Override
	public int editar(Cuenta cuenta) {
		String sql = "update cuenta set saldo='"+cuenta.getSaldo()+"' where id_cliente = "+cuenta.getId_cliente();	
		return this.ejecutarSql(sql);
	}

	@Override
	public Cuenta obtenerPorId(int id) {
		try {
			String sql="select id_cuenta, nro_cuenta,saldo, id_cliente from cuenta where id_cliente ="+id;
			ResultSet rsl=this.consultar(sql);
			Cuenta cuenta=null;
			while(rsl.next()) {
				cuenta = new Cuenta(rsl.getInt("id_cuenta"),
						rsl.getInt("nro_cuenta"),
						rsl.getInt("saldo"),
						rsl.getInt("id_cliente"));
			}
			return cuenta;
		}catch(SQLException e) {
			return null;
		}
	}

}
