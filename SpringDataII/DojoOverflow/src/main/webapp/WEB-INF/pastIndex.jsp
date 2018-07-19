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
				<title>Products</title>
			</head>

			<body>
				<div class="container">
					<h1>Products</h1>

					<form:form action="/products" method="POST" modelAttribute="product" class="form-group">
						<form:label path="name">Name:
							<form:errors class="errors" path="name"></form:errors>
							<form:input path="name"></form:input>
						</form:label>
						<br>

						<form:label path="cost">Cost:
							<form:errors class="errors" path="cost"></form:errors>
							<form:input path="cost"></form:input>
						</form:label>
						<br>

						<input type="submit" class="btn btn-info" value="Create Product" />
					</form:form>

					<table class="table table-hover">
						<tr class="info">
							<th>Name:</th>
							<th>Cost:</th>
							<th>Action:</th>
						</tr>

						<c:forEach items="${products}" var="i">
							<tr>
								<td>
									<a href="/products/${i.id}">${i.name}</a>
								</td>
								<td>${ i.cost }</td>
								<td>
									<form method="post" action="/products/${i.id}">
										<input type="submit" class="btn btn-danger" value="Delete ${i.name}" />
									</form>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>

			</body>

			</html>