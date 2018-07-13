<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<link rel="stylesheet" href="/css/index.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">

				<title>Dojo DMV</title>
			</head>

			<body>
				<h1>Welcome to the Dojo DMV License Creator!</h1>
			
						<p><a href="person/new">Add Person</a></p>
						<p><a href="license/new">Add License</a></p>
			
				<%--<!-- <div class="box2">--%>
					<%--<c:forEach items="${products}" var="i">--%>
						<%--<p>Brand:--%>
							<%--<a href="/product/${i.id}">${i.brand}</a>--%>
						<%--</p>--%>
						<%--<p>Name: ${i.name}</p>--%>
						<%--<p>Description:--%>
							<%--<br>--%>
							<%--<i>${i.description}</i>--%>
						<%--</p>--%>
						<%--<p>Price: ${i.price}</p>--%>
						<%--<form method="post" action="/product/${i.id}">--%>
							<%--<button type="submit" class="btn btn-info" value="Delete ${i.brand}">Delete Product</button>--%>
						<%--</form>--%>
						<%--<br>--%>
					<%--</c:forEach>--%>
				<%--</div> -->--%>
			</body>

			</html>