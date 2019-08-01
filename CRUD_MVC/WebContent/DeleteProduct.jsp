<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eliminar Producto</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container" id="containerBoot">

		<div class="row">
			<h2>Eliminar Producto</h2>
		</div>
		<div class="row">
			<form action="DeleteProduct" method="Post">
				<p>
					<label for="txtIDText">Introduce ID</label> 
					<br>
					<input type="text" id="txtIDText" name="txtID">
				</p>
			
				<p>
					<input type="submit" value="Eliminar">
				</p>
			</form>
		</div>

	</div>
	<script type="scripts/jquery-3.4.1.min-js"></script>
	<script type="scripts/popper.min.js"></script>
	<script type="scripts/bootstrap.bundle.min.js"></script>
</body>
</html>