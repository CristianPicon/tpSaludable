<!DOCTYPE html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

<title>Saludable</title>

<link rel="stylesheet" href="css/bootstrap.theme.min.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/sing.css" />
<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>






</head>
<body>
	<div class="container">
<h2 class="form-signin-heading">Bienvenido</h2>
		<h2 class="form-signin-heading">Si no estas Registrado ,selecciona Resgistrate</h2>

	</div>

	<button class="btn bt btn-lg btn-primary btn-block"
		onClick="mostrarPopup()" data-toggle="modal" data-target="#myModal">Registrate</button>
		

		   

	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Registro</h4>
				</div>
				<div class="modal-body">
					<div class="container">
						<div class="row">
							<div class="col-md-12">
								<form:form action="registro.do" commandName="registro"  method="post">


									<div class="form-group">
										<label>Nombre</label> <input type="text" name="nombre"
											"
											placeholder="Nombre" required>
									</div>

									<div class="form-group">
										<label>Apellido</label> <input type="text" name="apellido"
											placeholder="Apellido" required>
									</div>


									<div class="form-group">
										<label>DNI</label> <input type="text" name="dni"
											placeholder="DNI" required>
									</div>


									<div class="form-group">
										<label>MASCULINO </label> <input type="radio" name="sexo"
											value="masculino"> <label>FEMENINO </label><input
											type="radio" name="sexo" value="femenino">
									</div>
									<div class="form-group">
										<label>F.nac.</label> <input type="text" name="fnac"
											placeholder="Fecha Nacimiento" required>
									</div>
									<div class="form-group">
										<label>Localidad</label> <input type="text" name="localidad"
											placeholder="localidad" required>
									</div>


									<div class="form-group">
										<label> Usuario</label> <input type="text" name="usuario"
											placeholder="usuario" required>
									</div>



									<div class="form-group">
										<label>Password</label> <input type="password"
											name="password" placeholder="Password" required>
									</div>

								


									<button type="submit" class="btn btn-default">Submit</button>
								</form:form>
							</div>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<!-- 						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
					<!-- 						<button type="button" class="btn btn-primary">Save -->
					<!-- 							changes</button> -->
				</div>
			</div>
		</div>
	</div>
</body>


</html>


