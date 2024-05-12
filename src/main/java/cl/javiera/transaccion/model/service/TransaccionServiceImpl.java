package cl.javiera.transaccion.model.service;

import java.sql.SQLException;
import java.util.List;

import cl.javiera.transaccion.model.dao.TransaccionDAO;
import cl.javiera.transaccion.model.entity.Transaccion;

/**
 * Implementación de la interfaz TransaccionService que realiza la lógica de negocio relacionada con las transacciones.
 */
public class TransaccionServiceImpl implements TransaccionService{

	private TransaccionDAO transaccionDao;
	
	/**
     * Constructor de la clase TransaccionServiceImpl
     * 
     * @param transaccionDao El objeto TransaccionDao que se utilizará para acceder a los datos de las transacciones
     */
	public TransaccionServiceImpl(TransaccionDAO transaccionDao) {
		this.transaccionDao = transaccionDao;
	}
	
	@Override
	public boolean guardar(Transaccion transaccion) {
		if(transaccion.getId_transaccion()<0 && transaccion.getId_cuenta() <0 && transaccion.getId_tipo()<0) {
			return false;
		}
		int result = transaccionDao.guardar(transaccion);
		return result>0;
	}

	@Override
	public List<Transaccion> getListado() throws SQLException {
		return transaccionDao.getListado(2);
	}

}
