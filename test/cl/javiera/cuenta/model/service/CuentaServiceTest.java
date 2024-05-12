package cl.javiera.cuenta.model.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import cl.javiera.cuenta.model.dao.CuentaDAO;
import cl.javiera.cuenta.model.entity.Cuenta;

class CuentaServiceTest {

	private CuentaService cuentaService;
	private CuentaDAO cuentaDao;
	private Cuenta cuenta;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		cuentaDao = mock(CuentaDAO.class);
		cuentaService= new CuentaServiceImpl(cuentaDao);
	}

	@Test
	void testEditarCuentaSaldoPositivo() {	
		when(cuentaDao.editar(any(Cuenta.class))).thenReturn(1);
		
		cuenta = new Cuenta(1,598,100,1);
		boolean resultado = cuentaService.editar(cuenta);
		
		assertTrue(resultado);
		verify(cuentaDao).editar(any(Cuenta.class));
	}
	
	@Test
	void testEditarCuentaSaldoNegativo() {	
		cuenta = new Cuenta(1,598,-100,1);
		boolean resultado = cuentaService.editar(cuenta);
		
		assertFalse(resultado);
		verify(cuentaDao, never()).editar(any(Cuenta.class));
	}
	
	@Test
	void testObtenerPorIdNegativo() {
		when(cuentaDao.obtenerPorId(anyInt())).thenReturn(null);
		
		cuenta = cuentaService.obtenerPorId(-1);
		
		assertNull(cuenta);
	}
	
	@Test
	void testObtenerPorIdPositivo() {
		cuenta = new Cuenta();
		cuenta.setId_cliente(1);
		
		when(cuentaDao.obtenerPorId(1)).thenReturn(cuenta);
		
		Cuenta resultado = cuentaService.obtenerPorId(1);
		
		assertNotNull(resultado);
		assertEquals(cuenta,resultado);
	}
	
	

}
