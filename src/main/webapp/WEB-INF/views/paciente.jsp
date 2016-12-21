

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html >
<html>
<head>

<title>Insert title here</title>

<link rel="stylesheet" href="css/bootstrap.theme.min.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />

<script src="js/jquery-3.1.0.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/myjs.js" type="text/javascript"></script>
</head>
<body>


	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="post" id="logoutForm">
		<input type="hidden" />
	</form>
	<script>
		function formSubmit() {
			document.getElementById("logoutForm").submit();
		}
	</script>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Bienvenido : ${pageContext.request.userPrincipal.name}  
		</h2>
	</c:if>



	<!-- Static navbar -->
	<nav class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand"> Paciente</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#" onclick="registroNuevo()">Registrar
							dieta</a></li>
					<li><a href="#" onclick="inicio()">Informe Medico</a></li>







				</ul>
				<ul class="nav navbar-nav navbar-right">

					<li class="active"><a href="javascript:formSubmit()">Log
							Out <span class="sr-only">(current)</span>
					</a></li>

				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>




	<div class="container">



		<div>
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<form:form action="formularios.do" commandName="paciente"
							method="post">
							<table>
								<tr>
									<td>Tipo de comida</td>
									<td><form:input path="tipcomida" name="tipo de comida  required"  /></td>
								</tr>
								<tr>
									<td>Comida Principal</td>
									<td><form:input path="comPrincipal"
											name="comida Principal" /></td>
								</tr>
								<tr>
									<td>Comida Secundaria</td>
									<td><form:input path="comSecundaria"
											name="comida Secundaria" /></td>
								</tr>
								<tr>
									<td>Bebida</td>
									<td><form:input path="bebida" name=" bebida" /></td>
								</tr>
								<tr>
									<td>Postre</td>
									<td><form:input path="postre" name="precio" /></td>
								</tr>
								<tr>
									<td>Tentacion</td>
									<td><form:input path="tentacion" name="tentacion" /></td>
								</tr>

								<tr>
									<td>Alimento</td>
									<td><form:input path="alimento" name="alimento" /></td>
								</tr>

								<tr>
									<td>Hambre</td>
									<td><form:input path="hambre" name="hambre" /></td>
								</tr>


								<tr>
									<td>fecha</td>
									<td><form:input type="date" path="fecha" name="fecha" /></td>
								</tr>

								<!-- 								<tr> -->
								<!-- 									<td></td> -->
								<!-- 									<td><input type="submit" value="ingresar" /></td> -->

								<!-- 								</tr> -->

							</table>
							<button type="submit" value="ingresar" class="btn btn-default">Submit</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src="./Static Top Navbar Example for Bootstrap_files/jquery.min.js"></script>

	<script
		src="./Static Top Navbar Example for Bootstrap_files/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="./Static Top Navbar Example for Bootstrap_files/ie10-viewport-bug-workaround.js"></script>
</body>


</html>