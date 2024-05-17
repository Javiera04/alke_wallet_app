package cl.javiera.transaccion.model.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TransaccionTest {
	Transaccion transaccion;
	Transaccion transaccion_2;
	Transaccion transaccion_3;
	Date fecha = new Date();

	@BeforeEach
	void setUp() throws Exception {
		transaccion = new Transaccion(1,1,fecha,100,2);
		transaccion_2 = new Transaccion();
		transaccion_3 = new Transaccion(1,fecha,100,"Depósito");
		
	}

	@Test
	void testGetIdTransaccion() {
		assertEquals(1,transaccion.getId_transaccion());
	}

	@Test
	void testSetIdTransaccion() {
		transaccion.setId_transaccion(2);
		assertEquals(2, transaccion.getId_transaccion());
	}
	
	@Test
	void testGetIdCuenta() {
		assertEquals(1,transaccion.getId_cuenta());
	}
	
	@Test
	void testSetIdCuenta() {
		transaccion.setId_cuenta(5);
		assertEquals(5,transaccion.getId_cuenta());
	}
	
	@Test
	void testGetFechaTransaccion() {
		assertEquals(fecha,transaccion.getFecha_transaccion());
	}
	
	@Test
	void testSetFechaTransaccion() {
		Date fecha_update = new Date();
		transaccion.setFecha_transaccion(fecha_update);
		assertEquals(fecha_update,transaccion.getFecha_transaccion());
	}
	
	@Test
	void testGetMonto() {
		assertEquals(100,transaccion.getMonto());
	}
	
	@Test
	void testSetMonto() {
		transaccion.setMonto(120);
		assertEquals(120,transaccion.getMonto());
	}
	
	@Test
	void testGetIdTipo() {
		assertEquals(2,transaccion.getId_tipo());
	}
	
	@Test
	void testSetIdTipo() {
		transaccion.setId_tipo(1);
		assertEquals(1,transaccion.getId_tipo());
	}
	
	@Test
	void testGetNombreTipo() {
		assertEquals("Depósito",transaccion_3.getNombre_tipo());
	}
	
	@Test
	void testSetNombreTipo() {
		transaccion.setNombre_tipo("Retiro");
		assertEquals("Retiro",transaccion.getNombre_tipo());
	}
}

