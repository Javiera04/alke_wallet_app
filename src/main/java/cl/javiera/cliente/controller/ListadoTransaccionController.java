package cl.javiera.cliente.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import cl.javiera.transaccion.model.dao.*;
import cl.javiera.transaccion.model.entity.Transaccion;
import cl.javiera.transaccion.model.service.*;

/**
 * Servlet implementation class ListadoTransaccionController
 */
public class ListadoTransaccionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TransaccionDAO transaccionDao = new TransaccionDAOImpl();
		TransaccionService transaccionService = new TransaccionServiceImpl(transaccionDao);
		
		try {
			List<Transaccion> listado = transaccionService.getListado();
			
			request.setAttribute("listado", listado);
			
			request.getRequestDispatcher("/view/transaccion.jsp").forward(request, response);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}


}
