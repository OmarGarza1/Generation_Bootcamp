<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crear Producto</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container" id="containerBoot">

		<div class="row">
			<h2>Crear Producto</h2>
		</div>
		<div class="row">
			<form action="CreateServlet" method="post">
				<p>
					<label for="txtID">Introduce ID</label> 
					<input type="text" id="txtID" name="txtID">
				</p>
				<p>
					<label for="txtName">Introduce Nombre</label> 
					<input type="text" id="txtName" name="txtName">
				</p>
				<p>
					<label for="txtPrice">Precio Producto</label> 
					<input type="text" id="txtPrice" name="txtPrice">
				</p>
					<p>
					<label for="txtExist">Introduce Existencias</label> 
					<input type="text" id="txtExist" name="txtExist">
				</p>
				<p>
					<input type="submit" value="Guardar">
				</p>
			</form>
		</div>

	</div>
	<script type="scripts/jquery-3.4.1.min-js"></script>
	<script type="scripts/popper.min.js"></script>
	<script type="scripts/bootstrap.bundle.min.js"></script>
</body>
</html>