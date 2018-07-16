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
				<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
				    crossorigin="anonymous">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
			</head>

			<body>
				<div class="container">
					<h1>${person.fName} ${person.lName}</h1>
					<h4>License Number: ${license.number}</h4>
					<h4>State: ${license.state}</h4>
					<h4>Expiration Date: ${license.expiration}</h4>
					<br>
					<br>
					<a class="btn btn-success" href="/" role="button">Main Page</a>
				</div>


			</body>

			</html>