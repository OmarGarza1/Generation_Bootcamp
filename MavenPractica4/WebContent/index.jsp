<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Super Perritos</h2>
	
	 <c:out value="Mi Testo"></c:out>
	 <%! double salario=3.14; %>
	 <!-- MAKING A VARIABLE -->
	 <c:set var="miNombre" scope="session" value="Omar"></c:set>
	 <c:set var="miSalario" scope="session" value="3.14"></c:set>
	 
	 <!-- USING VARIABLE -->
	 <c:out value="${miSalario}"></c:out>
	 
	 <!-- FOR EACH -->
	 <c:forEach var="i" begin="1" end="5">
	 	<table>
	 	<tr>
	 	<c:out value="${miNombre}"></c:out>
	 	</tr>
	 	</table>
	 </c:forEach>
</body>
</html>