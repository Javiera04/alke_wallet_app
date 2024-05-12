package cl.javiera.cuenta.model.service;

import cl.javiera.cuenta.model.dao.CuentaDAO;
import cl.javiera.cuenta.model.entity.Cuenta;

/**
 * Implementación de la interfaz CuentaService que realiza la lógica de negocio relacionada con las cuentas.
 */
public class CuentaServiceImpl implements CuentaService{

	private CuentaDAO cuentaDao;
	
	/**
     * Constructor de la clase CuentaServiceImpl
     * 
     * @param cuentaDao El objeto CuentaDao que se utilizará para acceder a los datos de las cuentas
     */
	public CuentaServiceImpl(CuentaDAO cuentaDao) {
		this.cuentaDao = cuentaDao;
	}
	
	@Override
	public boolean editar(Cuenta cuenta) {
		if(cuenta.getSaldo() < 0) {
			return false;
		}
		int result = cuentaDao.editar(cuenta);
		return result>0;
	}

	@Override
	public Cuenta obtenerPorId(int id) {
		if(id < 0) {
			return null;
		}
		return cuentaDao.obtenerPorId(id);
		
	}

}
