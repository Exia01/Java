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

					<h1>${person.fName} ${person.lName}</h1>
					<h4>License Number: ${license.number}</h4>  
					<h4>State:  ${license.state}</h4>
					<h4>Expiration Date: ${license.expiration}</h4>  <br><br>
				</div>
			</body>

			</html>