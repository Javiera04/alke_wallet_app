package cl.javiera.cliente.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import cl.javiera.cuenta.model.dao.CuentaDAO;
import cl.javiera.cuenta.model.dao.CuentaDAOImpl;
import cl.javiera.cuenta.model.entity.Cuenta;
import cl.javiera.cuenta.model.service.CuentaService;
import cl.javiera.cuenta.model.service.CuentaServiceImpl;
import cl.javiera.transaccion.model.dao.TransaccionDAO;
import cl.javiera.transaccion.model.dao.TransaccionDAOImpl;
import cl.javiera.transaccion.model.entity.Transaccion;
import cl.javiera.transaccion.model.service.TransaccionService;
import cl.javiera.transaccion.model.service.TransaccionServiceImpl;


/**
 * Servlet implementation class DepositoController
 */
public class DepositoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private CuentaService cuentaService;
    private CuentaDAO cuentaDao;
    private Cuenta cuenta;
    private TransaccionService transaccionService;
    private TransaccionDAO transaccionDao;
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		cuentaDao= new CuentaDAOImpl();
		cuentaService= new CuentaServiceImpl(cuentaDao);
		cuenta = cuentaService.obtenerPorId(2);
		transaccionDao= new TransaccionDAOImpl();
		transaccionService= new TransaccionServiceImpl(transaccionDao);
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/view/deposito.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String montoFormulario = req.getParameter("monto_deposito");
		int monto = Integer.parseInt(montoFormulario);
		
		Transaccion transaccion = new Transaccion();
		Date fechaTransaccion = new Date();
		if(monto > 0) {
			int saldoActual = cuenta.getSaldo();
			
			saldoActual += monto;
			
			cuenta.setSaldo(saldoActual);
			
			java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaTransaccion.getTime());
			
			transaccion.setId_cuenta(cuenta.getId_cuenta());
			transaccion.setFecha_transaccion(timestamp);
			transaccion.setMonto(monto);
			transaccion.setId_tipo(1);
			
			boolean resultado = cuentaService.editar(cuenta);
			boolean result = transaccionService.guardar(transaccion);
			
			if(resultado == true && result == true) {
				req.getRequestDispatcher("/view/deposito-exitoso.jsp").forward(req, resp);
			}else {
				req.getRequestDispatcher("/view/deposito-fallido.jsp").forward(req, resp);
			}
				
		}else {
			req.getRequestDispatcher("/view/deposito-fallido.jsp").forward(req, resp);
		}
		
		
		
	}

}
