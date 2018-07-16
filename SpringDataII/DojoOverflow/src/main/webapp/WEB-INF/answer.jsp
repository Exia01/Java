<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="ISO-8859-1">
				<link rel="stylesheet" href="/css/index.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
				<title>Show Product</title>
			</head>

			<body>
				<div class="container">
					<h1>About: ${product.name}</h1>
					<form:form action="/products/${product.id}/update" method="POST" modelAttribute="product" class="form-group">
						<form:label path="name">Name:
							<form:errors class="errors" path="name"></form:errors>
							<form:input path="name"></form:input>
						</form:label>
						<form:label path="cost">Cost:
							<form:errors class="errors" path="cost"></form:errors>
							<form:input path="cost"></form:input>
						</form:label>

						<input type="submit"  class="btn btn-info" value="Update" />
					</form:form>
				</div>

			</body>

			</html>