package cl.javiera.cliente.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cl.javiera.cliente.model.entity.Cliente;
import cl.javiera.shared.model.dao.DAO;

/**
 * Implementación de la interfaz ClienteDAO que proporciona acceso a datos para la entidad Cliente
 */
public class ClienteDAOImpl extends DAO implements ClienteDAO{

	/**Constructor que establece la conexion a la base de datos*/
	public ClienteDAOImpl() {
		this.conectarDb();
	}
	
	@Override
	public Cliente obtenerPorId(int id) {
		try {
			String sql = "select id_cliente, rut, nombre, apellido from cliente where id_cliente = "+id;
			ResultSet rsl = this.consultar(sql);
			Cliente cliente = null;
			while(rsl.next()) {
				cliente = new Cliente(rsl.getInt("id_cliente"),
						rsl.getString("rut"),
						rsl.getString("nombre"),
						rsl.getString("apellido"));
			}
			return cliente;
		}catch(SQLException e) {
			return null;
		}
	}

}
