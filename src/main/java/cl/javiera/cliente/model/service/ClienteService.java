package cl.javiera.cliente.model.service;

import cl.javiera.cliente.model.entity.Cliente;

/**
 * Interfaz que se encarga de realizar la logica de negocio para la entidad Cliente
 */
public interface ClienteService {
	/**
	 * Obtiene un cliente por su identificador
	 * 
	 * @param id el identificador del cliente
	 * @return el objeto cliente correspondiente al identificador
	 */
	Cliente obtenerPorId(int id);
}
