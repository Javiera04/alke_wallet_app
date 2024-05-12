package cl.javiera.transaccion.model.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import cl.javiera.transaccion.model.dao.TransaccionDAO;
import cl.javiera.transaccion.model.entity.Transaccion;

class TransaccionServiceTest {

	private TransaccionService transaccionService;
	private TransaccionDAO transaccionDao;
	private Transaccion transaccion;
	
	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		transaccionDao=mock(TransaccionDAO.class);
		transaccionService= new TransaccionServiceImpl(transaccionDao);
	
		//when(transaccionDao.guardar(any(Transaccion.class))).thenReturn(true);
	}

	@Test
	void testGuardarCorrecto() {
		transaccion = new Transaccion(1,1,new Date(),200,1);
		
		boolean resultado = transaccionService.guardar(transaccion);
		
		assertTrue(resultado);
		verify(transaccionDao).guardar(any(Transaccion.class));
		
	}
	
	@Test
	void testGuardarIdTransaccionIncorrecto() {
		transaccion = new Transaccion(-1,1,new Date(),200,1);
		
		boolean resultado = transaccionService.guardar(transaccion);
		
		assertFalse(resultado);
		verify(transaccionDao, never()).guardar(any(Transaccion.class));
	}

}
