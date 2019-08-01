<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informacion individual</title>
<link rel="Stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container" id="containerBoot">
		<div class="row">
			<h2>Informacion individual</h2>
		</div>
		<div class="row">
			<form action="ReadIndiServlet" method="get">
				<p>
					<label for="txtID">Introduce ID</label> <input type="text"
						id="txtID" name="txtID">
				</p>
				<p>
					<input type="submit" value="Buscar">
				</p>
			</form>
		</div>
	</div>
	<script type="scripts/jquery-3.4.1.min-js"></script>
	<script type="scripts/popper.min.js"></script>
	<script type="scripts/bootstrap.bundle.min.js"></script>
</body>
</html>