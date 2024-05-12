<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inicio</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container pt-5">
	    <div class="row text-center"> 
	      <div class="col">
	        <h1>¡Te damos la bienvenida, ${cliente.nombre}!</h1>
	      </div>
	    </div>
	    <div class="row d-flex justify-content-center">
	      <div class="col-6">
	        <div class="card shadow">
	          <div class="card-body">
	            <h2 class="card-title fw-semibold fs-4">Cuenta Alke <span class="fw-normal">${cuenta.nro_cuenta}</span></h2>
	            <p class="card-text">Saldo disponible: </p>
	            <p class="card-text fs-4">$<span> ${cuenta.saldo} </span></p>
	          </div>
	        </div>
	      </div>
	    </div>
	    <div class="row pt-5 text-center">
	      <div class="col">
	        <a href="/evaluacion_cinco/DepositoController" type="button" class="btn btn-success mx-3">Depositar</a>
	        <a href="/evaluacion_cinco/RetiroController" type="button" class="btn btn-danger mx-3">Retirar</a>
	        <a href="/evaluacion_cinco/ListadoTransaccionController" type="button" class="btn btn-primary mx-3">Transacciones</a>
	      </div>
	    </div>
	 </div>

	
</body>
</html>