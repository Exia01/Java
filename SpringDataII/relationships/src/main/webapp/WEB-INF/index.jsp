<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
			<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
				<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

					<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
					<html>

					<head>
						<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
						<title>Index</title>
						<link rel="stylesheet" type="text/css" href="/css/style.css">
						<script src="/js/main.js"></script>
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
											<form:input path="brand"></form:input>
											<br>
											<form:errors path="brand"></form:errors>
										</form:label>
									</div>
									<br>
									<div class="form-group">
										<form:label path="name">Product Name
											<br>
											<form:input path="name"></form:input>
											<br>
											<form:errors path="name"></form:errors>
										</form:label>
									</div>
									<br>
									<div class="form-group">
										<form:label path="description">Product Description
											<br>
											<form:input path="description"></form:input>
											<br>
											<form:errors path="description"></form:errors>
										</form:label>
									</div>
									<br>
									<div class="form-group">
										<form:label path="price">Product Price
											<br>
											<form:input path="price"></form:input>
											<br>
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
									<p>Description:
										<br>
										<i>${i.description}</i>
									</p>
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