<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE HTML>
<!--
	Twenty by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>Registrar</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="/ProyectoEv2/config/styles/assets/css/main.css" />
<link rel="stylesheet"
	href="/ProyectoEv2/config/styles/assets/css/noscript.css" />
<link rel="stylesheet" href="/ProyectoEv2/config/styles/stylesLoginn.css"
	type="text/css">
<link rel="stylesheet" href="/ProyectoEv2/config/styles/stylesCrUser.css">
<script type="text/javascript" src="/ProyectoEv2/config/JS/validaciones.js"></script>
</head>
<body class="index is-preload">
	<c:set var="p1" value="${requestScope['usuario']}" />
	<c:set var="p2" value="${requestScope['mensaje']}" />
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header" class="alt">
			<h1 id="logo">
				<a href="index.html"><span>HOME</span></a>
			</h1>
			<nav id="nav">
				<ul>
					<li><a href="/ProyectoEv2/Public/login.jsp" class="button primary">Iniciar Sesion</a></li>
				</ul>
			</nav>
		</header>

		<!-- Banner -->
		<section id="banner">

			<!--
						".inner" is set up as an inline-block so it automatically expands
						in both directions to fit whatever's inside it. This means it won't
						automatically wrap lines, so be sure to use line breaks where
						appropriate (<br />).
					-->
			<div class="inner">

				<div class="cuerpo">
					<div class="contenedor">
						<form action="/ProyectoEv2/crearUsuario" method="POST"
							onsubmit="return validarCamposObligatorios()">
							<div class="container">
								<p>Registrar Usuario</p>
								<hr>

								<label for="cedula"><b>Cedula</b></label> <input id="cedulaID"
									type="text"  value="${p1.cedula}" placeholder="Ingresar cedula" name="cedula"
									onkeypress="ValidarNumeros(event, 'mensajeCedula', this)"
									required> <span id="mensajeCedula"></span> <label
									for="nombres"><b>Nombres</b></label> <input id="nombresID"
									type="text"  value="${p1.nombres}" placeholder="Ingresar nombres" name="nombres"
									onkeypress="ValidarLetras(event, 'mensajeNombres', this)"
									required><span id="mensajeNombres"></span> <label
									for="apellidos"><b>Apellidos</b></label> <input
									id="apellidosID"  value="${p1.apellidos}" type="text" placeholder="Ingresar apellidos"
									name="apellidos"
									onkeypress="ValidarLetras(event, 'mensajeApellidos', this)"
									required><span id="mensajeApellidos"></span> <label
									for="email"><b>Email</b></label> <input id="emailID"
									type="text"  value="${p1.correo}" placeholder="Ingresar email" name="email" required><span style="border: 1px red solid; color: red"
									id="mensajeCorreo"> ${p2}</span><br> <label for="psw"><b>Contraseña</b></label>
								<input id="passID" type="password"  value="${p1.password}"
									placeholder="Ingresar contraseña" name="psw" required>
								<hr>

								<button type="submit" class="registerbtn" name="registrarUsr"
									value="RegistrarUsr">Registrar</button>
							</div>

						</form>

					</div>

				</div>


			</div>

		</section>



		<!-- Footer -->
		<footer id="footer">

			<ul class="icons">
				<li><a href="#" class="icon brands circle fa-twitter"><span
						class="label">Twitter</span></a></li>
				<li><a href="#" class="icon brands circle fa-facebook-f"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon brands circle fa-google-plus-g"><span
						class="label">Google+</span></a></li>
				<li><a href="#" class="icon brands circle fa-github"><span
						class="label">Github</span></a></li>
				<li><a href="#" class="icon brands circle fa-dribbble"><span
						class="label">Dribbble</span></a></li>
			</ul>

			<ul class="copyright">
				<li>&copy; Untitled</li>
				<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
			</ul>

		</footer>

	</div>

	<!-- Scripts -->
	<script src="/ProyectoEV/config/styles/assets/js/jquery.min.js"></script>
	<script
		src="/ProyectoEV/config/styles/assets/js/jquery.dropotron.min.js"></script>
	<script src="/ProyectoEV/config/styles/assets/js/jquery.scrolly.min.js"></script>
	<script
		src="/ProyectoEV/config/styles/assets/js/jquery.scrollex.min.js"></script>
	<script src="/ProyectoEV/config/styles/assets/js/browser.min.js"></script>
	<script src="/ProyectoEV/config/styles/assets/js/breakpoints.min.js"></script>
	<script src="/ProyectoEV/config/styles/assets/js/util.js"></script>
	<script src="/ProyectoEV/config/styles/assets/js/main.js"></script>

</body>
</html>