package cl.javiera.transaccion.model.dao;

import java.util.List;

import cl.javiera.transaccion.model.entity.Transaccion;

/**
 * Interfaz que define las operaciones de acceso a datos para la entidad Transaccion.
 */
public interface TransaccionDAO {
	/**
	 * Guarda una nueva transaccion en la base de datos
	 * 
	 * @param transaccion la transaccion que sera agregada
	 * @return la ejecucion SQL
	 */
	int guardar(Transaccion transaccion);
	/**
	 * Muestra la totalidad de las transaccion
	 * @param id el id de la cuenta que se quiere mostrar los datos
	 * @return los datos de la consulta
	 */
	List<Transaccion> getListado(int id);
}
