package cl.javiera.cliente.model.service;

import cl.javiera.cliente.model.dao.ClienteDAO;
import cl.javiera.cliente.model.entity.Cliente;

/**
 * Implementación de la interfaz ClienteService que realiza la lógica de negocio relacionada con los clientes.
 */
public class ClienteServiceImpl implements ClienteService{

	private ClienteDAO clienteDao;
	
	/**
     * Constructor de la clase ClienteServiceImpl.
     * 
     * @param clienteDao El objeto ClienteDAO que se utilizará para acceder a los datos de los clientes.
     */
	public ClienteServiceImpl(ClienteDAO clienteDao) {
		this.clienteDao = clienteDao;
	}
	
	@Override
	public Cliente obtenerPorId(int id) {
		if(id < 0) {
			return null;
		}else {
			return clienteDao.obtenerPorId(id);
		}
	}

}
