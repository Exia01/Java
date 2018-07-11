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
			</head>

			<body>
				<div class="container">
					<div class="box1">
						<h1>Products</h1>
						<br>

						<form:form action="/product" method="POST" modelAttribute="product">
							<div class="form-group">
								<form:label path="brand">Product Brand
									<br>
									<form:input path="brand"></form:input><br>
									<form:errors path="brand"></form:errors>
								</form:label>
							</div>
							<br>
							<div class="form-group">
								<form:label path="name">Product Name
									<br>
									<form:input path="name"></form:input><br>
									<form:errors path="name"></form:errors>
								</form:label>
							</div>
							<br>
							<div class="form-group">
								<form:label path="description">Product Description
									<br>
									<form:input path="description"></form:input><br>
									<form:errors path="description"></form:errors>
								</form:label>
							</div>
							<br>
							<div class="form-group">
								<form:label path="price">Product Price
									<br>
									<form:input path="price"></form:input><br>
									<form:errors path="price"></form:errors>
								</form:label>
							</div>
							<br>
							<button type="submit" class="btn btn-success">Create Product</button>
						</form:form>
					</div>

					<div class="box2">
						<c:forEach items="${products}" var="i">
							<p>Brand:
								<a href="/product/${i.id}">${i.brand}</a>
							</p>
							<p>Name: ${i.name}</p>
							<p>Description: <br><i>${i.description}</i></p>
							<p>Price: ${i.price}</p>
							<form method="post" action="/product/${i.id}">
								<button type="submit" class="btn btn-info" value="Delete ${i.brand}">Delete Product</button>
							</form>
							<br>
						</c:forEach>
					</div>
				</div>
			</body>

			</html>