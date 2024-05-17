package cl.javiera.cuenta.model.entity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	Cuenta cuenta, cuenta_2;
	
	@BeforeEach
	void setUp() throws Exception {
		cuenta = new Cuenta(2,5987,1000,1);
		cuenta_2 = new Cuenta();
	}

	@Test
	void testGetIdCuenta() {
		assertEquals(2,cuenta.getId_cuenta());
	}
	
	@Test
	void testSetIdCuenta() {
		cuenta.setId_cuenta(5);
		assertEquals(5,cuenta.getId_cuenta());
	}
	
	@Test
	void testGetNroCuenta() {
		assertEquals(5987,cuenta.getNro_cuenta());
	}
	
	@Test
	void testSetNroCuenta() {
		cuenta.setNro_cuenta(5988);
		assertEquals(5988,cuenta.getNro_cuenta());
	}
	
	@Test
	void testGetSaldo() {
		assertEquals(1000,cuenta.getSaldo());
	}
	
	@Test
	void testSetSaldo() {
		cuenta.setSaldo(1500);
		assertEquals(1500,cuenta.getSaldo());
	}
	
	@Test
	void testGetIdCliente() {
		assertEquals(1,cuenta.getId_cliente());
	}
	
	@Test
	void testSetIdCliente() {
		cuenta.setId_cliente(2);
		assertEquals(2,cuenta.getId_cliente());
	}

	

}
