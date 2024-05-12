package cl.javiera.transaccion.model.entity;

import java.util.Date;

/**
 * La clase 'Transaccion' representa la entidad transaccion de la base de datos de la billetera virtual.
 * Almacena información de las transacciones.
 */
public class Transaccion {
	/**Identificador de la transaccion*/
	private int id_transaccion;
	/**Identificador de la cuenta (fk)*/
	private int id_cuenta;
	/**Fecha en la que se realizo la transaccion*/
	private Date fecha_transaccion;
	/**Monto de la transaccion*/
	private int monto;
	/**Identificador del tipo de transaccion(fk)*/
	private int id_tipo;
	/**Nombre del tipo de transaccion*/
	private String nombre_tipo;
	
	/**Constructor vacio de la clase transaccion*/
	public Transaccion() {}
	
	/**
	 * Constructor para insertar en la tabla transaccion
	 * @param id_transaccion el identificador de la transaccion
	 * @param id_cuenta el identificador de la cuenta
	 * @param fecha_transaccion la fecha de la transaccion
	 * @param monto el monto de la transaccion
	 * @param id_tipo el tipo de transaccion
	 */
	public Transaccion(int id_transaccion, int id_cuenta, Date fecha_transaccion, int monto,
			int id_tipo) {
		this.id_transaccion = id_transaccion;
		this.id_cuenta = id_cuenta;
		this.fecha_transaccion = fecha_transaccion;
		this.monto = monto;
		this.id_tipo = id_tipo;
	}
	
	/**
	 * Constructor para mostrar la lista de transacciones
	 * @param id_transaccion el identificador de la transaccion
	 * @param fecha_transaccion la fecha de la transaccion
	 * @param monto el monto de la transaccion
	 * @param nombre_tipo el nombre del tipo de transaccion
	 */
	public Transaccion(int id_transaccion, Date fecha_transaccion, int monto,
			String nombre_tipo) {
		this.id_transaccion = id_transaccion;
		this.fecha_transaccion = fecha_transaccion;
		this.monto = monto;
		this.nombre_tipo = nombre_tipo;
	}
	
	public int getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(int id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public int getId_cuenta() {
		return id_cuenta;
	}
	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}
	public Date getFecha_transaccion() {
		return fecha_transaccion;
	}
	public void setFecha_transaccion(Date fecha_transaccion) {
		this.fecha_transaccion = fecha_transaccion;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	public int getId_tipo() {
		return id_tipo;
	}
	public void setId_tipo(int id_tipo) {
		this.id_tipo = id_tipo;
	}
	public String getNombre_tipo() {
		return nombre_tipo;
	}
	public void setNombre_tipo(String nombre_tipo) {
		this.nombre_tipo = nombre_tipo;
	}
	
	
}
