<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="ISO-8859-1">
				<link rel="stylesheet" href="/css/index.css">
				<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B" crossorigin="anonymous">
				<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
				<title>Categories</title>
			</head>

			<body>
				<div class="container">
					<h1>Categories</h1>

					<form:form action="/categories" class="form-group" method="POST" modelAttribute="category">
						<form:label path="name">Category name:
							<form:errors class="errors" path="name"></form:errors>
							<form:input path="name"></form:input>
						</form:label>
						<br>

						<input type="submit" class="btn btn-info" value="Create Category" />
					</form:form>

					<table class="table table-hover">
						<tr>
							<th>Name</th>
							<th>Date created</th>
							<th>Actions</th>
						</tr>

						<c:forEach items="${categories}" var="i">
							<tr>
								<td>
									<a href="/categories/${i.id}">${i.name}</a>
								</td>
								<td>
									<p>${i.createdAt}</p>
								</td>
								<td>
									<form method="post" action="/categories/${i.id}">
										<input type="submit" class="btn btn-danger" value="Delete" />
									</form></p>
								</td>
							</tr>
						</c:forEach>
					</table>
					<a href="/products"><button class="btn btn-secondary">Products</button></a><br><br>
					<a href="/join"><button class="btn btn-secondary">Join</button></a>
				</div>
			</body>

			</html>