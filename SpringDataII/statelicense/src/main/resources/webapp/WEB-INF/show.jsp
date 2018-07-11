<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Product Update</title>
				<link rel="stylesheet" href="/css/show.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
			</head>

			<body>
				<div class="container">
				
					<form:form action="/product/${product.id}/update" method="POST" modelAttribute="product">
						<div class="form-group">
						<h1>${product.brand} ${product.name}</h1>
						</div><br>
						<div class="form-group">
						<form:label path="brand">Update Brand<br>
							<form:input path="brand" style="color:palevioletred;"></form:input>
							<form:errors path="brand"></form:errors><br>
						</form:label></div><br>
						<div class="form-group">
						<form:label path="name">Update Name<br>
						<form:input path="name" style="color:palevioletred;"></form:input>
							<form:errors path="name"></form:errors>
						</form:label></div><br>
						<div class="form-group">
						<form:label path="description">Update Description<br>
						<form:input path="description" style="color:palevioletred;"></form:input>
							<form:errors path="description"></form:errors>
						</form:label></div><br>
						<div class="form-group">
						<form:label path="price">Update Price<br>
						<form:input path="price" style="color:palevioletred;"></form:input>
							<form:errors path="price"></form:errors>
						</form:label></div><br>

						<button type="submit" class="btn btn-info" value="Update">Update Product</button>
					</form:form>
				</div>
			</body>

			</html>