package cl.javiera.cuenta.model.entity;

/**
 * La clase 'Cuenta' representa la entidad cuenta de la base de datos de la billetera virtual.
 * Almacena información de la cuenta, como identificador de la cuenta, numero de cuenta,
 * saldo y la relacion con la tabla cliente.
 */
public class Cuenta {
	/**Identificador de la cuenta*/
	private int id_cuenta;
	/**Numero de la cuenta*/
	private int nro_cuenta;
	/**Saldo de la cuenta*/
	private int saldo;
	/**Identificador del cliente (fk)*/
	private int id_cliente;
	
	/**Constructor vacio de la clase cuenta*/
	public Cuenta() {}

	/**
	 * Constructor de la clase cuenta
	 * @param id_cuenta el identificador de la cuenta
	 * @param nro_cuenta el numero de cuenta
	 * @param saldo el saldo de la cuenta
	 * @param id_cliente el identificador del cliente
	 */
	public Cuenta(int id_cuenta, int nro_cuenta, int saldo, int id_cliente) {
		this.id_cuenta = id_cuenta;
		this.nro_cuenta = nro_cuenta;
		this.saldo = saldo;
		this.id_cliente = id_cliente;
	}

	public int getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(int id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public int getNro_cuenta() {
		return nro_cuenta;
	}

	public void setNro_cuenta(int nro_cuenta) {
		this.nro_cuenta = nro_cuenta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
}
