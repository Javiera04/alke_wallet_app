package cl.javiera.cliente.model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	Cliente cliente, cliente_2;

	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente(1,"11111111-1","Usuario","Prueba");
		cliente_2 = new Cliente();
	}

	@Test
	void testGetIdCliente() {
		assertEquals(1, cliente.getId_cliente());
	}
	
	@Test
	void testSetIdCliente() {
		cliente.setId_cliente(2);
		assertEquals(2, cliente.getId_cliente());
	}
	
	@Test
	void testGetRut() {
		assertEquals("11111111-1", cliente.getRut());
	}
	
	@Test
	void testSetRut() {
		cliente.setRut("22222222-2");
		assertEquals("22222222-2", cliente.getRut());
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Usuario", cliente.getNombre());
	}
	
	@Test
	void testSetNombre() {
		cliente.setNombre("Usuarioski");
		assertEquals("Usuarioski", cliente.getNombre());
	}
	
	@Test
	void testGetApellido() {
		assertEquals("Prueba", cliente.getApellido());
	}
	
	@Test
	void testSetApellido() {
		cliente.setApellido("PruebaUno");
		assertEquals("PruebaUno", cliente.getApellido());
	}
	
	
	
	

}
