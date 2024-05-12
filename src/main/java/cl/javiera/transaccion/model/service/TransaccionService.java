package cl.javiera.transaccion.model.service;

import java.sql.SQLException;
import java.util.List;

import cl.javiera.transaccion.model.entity.Transaccion;

/**
 * Interfaz que se encarga de realizar la logica de negocio para la entidad Transaccion
 */
public interface TransaccionService {
	/**
	 * Guarda una Transaccion
	 *  
	 * @param transaccion la transaccion que sera agregada
	 * @return el resultado de guardar la transaccion
	 */
	boolean guardar(Transaccion transaccion);
	/**
	 * Genera el listado de transacciones de la cuenta
	 * 
	 * @return el listado de transaccion ascociadas a la cuenta
	 * @throws SQLException excepcion SQL
	 */
	List<Transaccion> getListado() throws SQLException;
}
