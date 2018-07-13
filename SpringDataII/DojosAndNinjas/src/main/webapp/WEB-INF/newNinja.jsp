<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>New Ninja!</title>
				<link rel="stylesheet" href="/css/new.css">
				<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
				<link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
			</head>

			<body>
				<div class="container">

					<h1>New Ninja!</h1>
					<br>

					<a href="/dojos" class="btn btn-success">Dashboard</a>
					<a href="/ninjas/new" class="btn btn-success">New Ninja</a>
					<hr>
					<br>
					<br>
					<form:form action="/ninjas/process" method="POST" modelAttribute="ninja" class="form-group">
						<select name="dojo">
							<option>Select A Dojo Location</option>
							<c:forEach items="${dojos}" var="dojo">
								<option value="${dojo.id}">${dojo.name}</option>
							</c:forEach>
						</select>
						<br>
						<br>
						<form:label path="fname">First Name</form:label>
						<br>
						<form:input path="fname"></form:input>
						<br>
						<form:errors path="fname"/><br>

						<form:label path="lname">Last Name</form:label>
						<br>
						<form:input path="lname"></form:input>
						<br>
						<form:errors path="lname"/>
						<br>

						<form:label path="age">Age</form:label>
						<br>
						<form:input path="age"></form:input>
						<br>
						<form:errors path="age"/>
						<br>
						<button type="submit" class="btn btn-info">Submit</button>
					</form:form>

					<a href="/"><button class="btn btn-secondary">Main Page</button></a>



				</div>

			</body>

			</html>