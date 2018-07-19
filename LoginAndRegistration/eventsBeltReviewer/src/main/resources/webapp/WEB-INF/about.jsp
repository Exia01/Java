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
				<title>Products</title>
			</head>

			<body>
				<div class="container">
						<h1 class="font-weight-bold">${question.questionName}</h1>
						<c:forEach items="${question.tags}" var="tag">
							<p>${ tag.name }</p>
						</c:forEach>

				<a  href="/questions" class="btn btn-success" role="button">Go Back</a> 
				</div>
			</body>

			</html>