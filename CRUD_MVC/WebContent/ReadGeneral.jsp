<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informacion de la Base de datos</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container" id="containerBoot">

		<div class="row">
			<h2>Informacion de la Base de datos</h2>
		</div>
		<div class="row">
			<form action="ReadGeneralServlet" method="get">
				<p>
					<input type="submit" value="Mostrar todos los productos">
				</p>
			</form>
		</div>
	</div>
	<script type="scripts/jquery-3.4.1.min-js"></script>
	<script type="scripts/popper.min.js"></script>
	<script type="scripts/bootstrap.bundle.min.js"></script>
</body>
</html>