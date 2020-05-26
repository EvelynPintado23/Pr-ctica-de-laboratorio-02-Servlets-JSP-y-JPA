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
<title>Iniciar Sesion</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet"
	href="/ProyectoEv2/config/styles/assets/css/main.css" />
<link rel="stylesheet"
	href="/ProyectoEv2/config/styles/assets/css/noscript.css" />
<link rel="stylesheet" href="/ProyectoEV/config/styles/stylesLoginn.css"
	type="text/css">	
</head>
<body class="index is-preload">
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header" class="alt">
			<h1 id="logo">
				<a href="index.html"> <span>HOME</span></a>
			</h1>
			<nav id="nav">
				<ul>
					<li class="current"><a href="index.html">Bienvendo</a></li>
					<li class="submenu"><a href="#">Contactos</a>
						<ul>
							<li><a href="left-sidebar.html">Listar Contactos</a></li>
							
						</ul>
					<li><a href="/ProyectoEv2/Public/crear_usuario.jsp" class="button primary">Registrarse</a></li>
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

					<div class="contenido">
						<form action="/ProyectoEv2/iniciarSesion" method="POST">

							<div class="imgcontainer">
								<img src="/ProyectoEv2/config/images/avat_ima.png"
									alt="Avatar" class="avatar">
							</div>

							<div class="container">
								<label for="correo"><b>Correo</b></label> <input type="text"
									placeholder="Ingrese Correo" name="correo" required> <label
									for="contraseña"><b>Contraseña</b></label> <input
									type="password" placeholder="Ingrese Contraseña"
									name="contrasena" required>

								<button type="submit" name="accion" value="Ingresar">Ingresar</button>

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
	<script src="/ProyectoEv2/config/styles/assets/js/jquery.min.js"></script>
	<script
		src="/ProyectoEv2/config/styles/assets/js/jquery.dropotron.min.js"></script>
	<script src="/ProyectoEv2/config/styles/assets/js/jquery.scrolly.min.js"></script>
	<script
		src="/ProyectoEv2/config/styles/assets/js/jquery.scrollex.min.js"></script>
	<script src="/ProyectoEv2/config/styles/assets/js/browser.min.js"></script>
	<script src="/ProyectoEv2/config/styles/assets/js/breakpoints.min.js"></script>
	<script src="/ProyectoEv2/config/styles/assets/js/util.js"></script>
	<script src="/ProyectoEv2/config/styles/assets/js/main.js"></script>

</body>
</html>