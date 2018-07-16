<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="ISO-8859-1">
				<link rel="stylesheet" href="/css/index.css">
				<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
				    crossorigin="anonymous">
				<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
				<title>Show Product</title>
			</head>

			<body>

				<h1>Product: ${product.name}</h1>
				<table class="table table-hover">
					<form:form action="/products/${product.id}/update" method="POST" modelAttribute="product" class="form-group">
						<tr>
							<th>Name</th>
							<th>Cost</th>
							<th>Action</th>
						</tr>
						<tr>
							<td>
								<form:label path="name">Name:
									<form:errors class="errors" path="name"></form:errors>
									<form:input path="name"></form:input>
								</form:label>
								<br>
							</td>
							<td>
								<form:label path="cost">Cost:
									<form:errors class="errors" path="cost"></form:errors>
									<form:input path="cost"></form:input>
								</form:label>
							</td>
							<td>
								<input type="submit" class="btn btn-info" value="Update" />
							</td>
						</tr>
						</form:form>
				</table>
				<br>

				<a href="/products"><button class="btn btn-secondary">Go back</button></a>
		

			</body>

			</html>