package cl.javiera.cliente.model.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import cl.javiera.cliente.model.dao.ClienteDAO;
import cl.javiera.cliente.model.entity.Cliente;

class ClienteServiceTest {

	private ClienteService clienteService;
	private ClienteDAO clienteDao;
	private Cliente cliente;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		
		clienteDao = mock(ClienteDAO.class);
		
		clienteService = new ClienteServiceImpl(clienteDao);
		
	}
	
	
	@Test
	void testObtenerPorIdNegativo() {
		when(clienteDao.obtenerPorId(anyInt())).thenReturn(null);
	
		cliente = clienteService.obtenerPorId(-1);
		
		assertNull(cliente);
	}
	
	@Test
	void testObtenerPorIdPositivo() {
		cliente = new Cliente();
		cliente.setId_cliente(1);
		cliente.setNombre("Cliente 1");
		
		when(clienteDao.obtenerPorId(1)).thenReturn(cliente);
		
		Cliente resultado = clienteService.obtenerPorId(1);
		
		assertNotNull(resultado);
		assertEquals(cliente, resultado);
	}

}
