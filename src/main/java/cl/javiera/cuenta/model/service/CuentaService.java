package cl.javiera.cuenta.model.service;

import cl.javiera.cuenta.model.entity.Cuenta;

/**
 * Interfaz que se encarga de realizar la logica de negocio para la entidad Cuenta
 */
public interface CuentaService {
	/**
	 * Edita una cuenta
	 * 
	 * @param cuenta el objeto cuenta que sera editado
	 * @return el objeto cuenta editado
	 */
	boolean editar(Cuenta cuenta);
	/**
	 * Obtiene una cuenta por su identificador
	 *  
	 * @param id el identificador de la cuenta
	 * @return el objeto cuenta correspondiente al identificador
	 */
	Cuenta obtenerPorId(int id);
}
