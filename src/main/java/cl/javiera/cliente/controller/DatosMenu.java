package cl.javiera.cliente.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import cl.javiera.cliente.model.dao.*;
import cl.javiera.cliente.model.entity.Cliente;
import cl.javiera.cliente.model.service.*;
import cl.javiera.cuenta.model.dao.*;
import cl.javiera.cuenta.model.entity.Cuenta;
import cl.javiera.cuenta.model.service.*;

/**
 * Servlet implementation class DatosMenu
 */
public class DatosMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_cliente = 2;
		
		ClienteDAO clienteDao = new ClienteDAOImpl();
		ClienteService clienteService = new ClienteServiceImpl(clienteDao);
		
		CuentaDAO cuentaDao = new CuentaDAOImpl();
		CuentaService cuentaService = new CuentaServiceImpl(cuentaDao);
		
		Cliente cliente = clienteService.obtenerPorId(id_cliente);
		Cuenta cuenta = cuentaService.obtenerPorId(id_cliente);

		System.out.println("Cliente obtenido: " + cliente);
		System.out.println("Cuenta obtenida: " + cuenta);
		
		request.setAttribute("cliente", cliente);
		request.setAttribute("cuenta", cuenta);
		request.getRequestDispatcher("/view/menu.jsp").forward(request, response);
	}


}
