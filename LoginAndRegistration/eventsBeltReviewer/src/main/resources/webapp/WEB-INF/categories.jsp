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
				<title>Categories</title>
			</head>

			<body>
				<div class="container">
					<h1>Categories</h1>

					<form:form action="/categories" class="form-group" method="POST" modelAttribute="category">
						<form:label path="name">Name:
							<form:errors class="errors" path="name"></form:errors>
							<form:input path="name"></form:input>
						</form:label>
						<br>

						<input type="submit" class="btn btn-info" value="Create Category" />
					</form:form>

					<table class="table table-hover">
						<tr>
							<th>Name:</th>
						</tr>

						<c:forEach items="${categories}" var="i">
							<tr>
								<td>
									<a href="/categories/${i.id}">${i.name}</a>
								</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</body>

			</html>