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
				<link rel="stylesheet" href="/css/index.css">
				<title>Products</title>
			</head>

			<body>
				<h1 class="font-weight-bold">What is your question?</h1>
				<!-- using form instead of form form to extract parameters from the "POST" information -->
				<form action="/questions/new" method="POST" class="form-group">
					<p class="red">
						<c:out value="${qError}" />
					</p>
					<p class="red">
						<c:out value="${tError}" />
					</p>
					<label>Question:</label>
						<textarea name="question" cols="50" autofocus></textarea>
					<br> Tag(s):
					<input type="text" name="tags">
					<input type="submit" value="submit" class="btn btn-success">
				</form>

			</body>

			</html>