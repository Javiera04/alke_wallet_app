package cl.javiera.cliente.model.entity;

/**
 * La clase 'Cliente' representa la entidad cliente de la base de datos de la billetera virtual.
 * Almacena información personal del cliente, como nombre, rut, nombre y apellido.
 * 
 */
public class Cliente {
	/**Identificador del cliente*/
	private int id_cliente;
	/**Rut del cliente*/
	private String rut;
	/**Nombre del cliente*/
	private String nombre;
	/**Apellido del cliente*/
	private String apellido;
	
	/**Constructor vacio de la clase cliente*/
	public Cliente() {}
	/**
	 * Constructor de la clase cliente
	 * @param id_cliente el id del cliente
	 * @param rut el rut del cliente
	 * @param nombre el nombre del cliente
	 * @param apellido el apellido del cliente
	 */
	public Cliente(int id_cliente, String rut, String nombre, String apellido) {
		this.id_cliente = id_cliente;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
