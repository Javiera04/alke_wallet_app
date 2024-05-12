package cl.javiera.cliente.model.dao;

import cl.javiera.cliente.model.entity.Cliente;

/**
 * Interfaz que define las operaciones de acceso a datos para la entidad Cliente.
 */
public interface ClienteDAO {
	/**
     * Obtiene un cliente por su identificador
     * 
     * @param id El identificador del cliente
     * @return El objeto Cliente correspondiente al identificador proporcionado, o null si no se encuentra
     */
	Cliente obtenerPorId(int id);
}
