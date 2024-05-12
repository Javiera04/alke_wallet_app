package cl.javiera.shared.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Proporciona métodos para la conexión y ejecución de consultas SQL en una base de datos MySQL
 */
public class DAO {
	private Connection conn;
	private ResultSet resultSet;
	private Statement stmt;
	
	
	/**
	 * Crea la conexión a la base de datos MySQL
	 */
	protected void conectarDb() {
		try {
			if(conn==null || conn.isClosed()) {
				
				Class.forName("com.mysql.jdbc.Driver");
				String stringConection="jdbc:mysql://localhost:3306/billetera";
				String user="root";
				String pass="JAVIyti2509045.";
				conn = DriverManager.getConnection(stringConection,user,pass);
				System.out.println("Conectado a la Base de Datos");
			}
			
		}catch(ClassNotFoundException ex) {
			System.out.println("Error:Driver no encontrado");
		}catch(SQLException ex) {
			System.out.println("Fallo:");
			System.out.println("SQLException:"+ ex.getMessage());
			System.out.println("SQLState:"+ ex.getSQLState());
			System.out.println("VendorError:"+ ex.getErrorCode());
		}
		
	}
	
	
	/**
     * Ejecuta una consulta SQL y devuelve un ResultSet con los resultados
     * 
     * @param sql La consulta SQL a ejecutar
     * @return Un ResultSet con los resultados de la consulta, o null si ocurre un error
     */
	protected ResultSet consultar(String sql) {
		try {
			conectarDb();
			this.stmt= conn.createStatement();
			resultSet = stmt.executeQuery(sql);
			close();
			return resultSet;
		} catch (SQLException e) {
			System.out.print(e.getMessage());
			return null;
		}
	}
	
	/**
     * Ejecuta una sentencia SQL de modificación (INSERT, UPDATE, DELETE)
     * 
     * @param sql La sentencia SQL de modificación a ejecutar
     * @return El número de registros modificados por la sentencia
     */
	protected int ejecutarSql(String sql) {
		try {
			conectarDb();
			this.stmt= conn.createStatement();
			int regModificiados = stmt.executeUpdate(sql);
			
			close();
			return regModificiados;
			
		} catch (SQLException e) {
			System.out.print(e.getMessage());
			return 0;
		}
	}
	
	/**
     * Cierra la conexión a la base de datos
     */
	protected void close() {		
		/*
		try {
			
			if(stmt!=null) {
				stmt.close();
			}
			if(resultSet!=null) {
				resultSet.close();
			}
			if(conn!=null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.print("Error Cerrando"+e.getMessage());
		}*/
		
	}
}
