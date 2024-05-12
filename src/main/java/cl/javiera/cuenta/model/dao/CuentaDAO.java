package cl.javiera.cuenta.model.dao;

import cl.javiera.cuenta.model.entity.Cuenta;

/**
 * Interfaz que define las operaciones de acceso a datos para la entidad Cuenta.
 */
public interface CuentaDAO {
	/**
     * Edita una cuenta existente en la base de datos.
     * 
     * @param cuenta La cuenta que sera editada
     * @return El número de filas afectadas en la base de datos después de la edición. 
     */
	int editar(Cuenta cuenta);
	
	/**
     * Obtiene una cuenta por su identificador único.
     * 
     * @param id El identificador único de la cuenta.
     * @return El objeto Cuenta correspondiente al identificador proporcionado, 
     *         o null si no se encuentra ninguna cuenta con ese identificador.
     */
	Cuenta obtenerPorId(int id);
}
