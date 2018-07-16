<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
		<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<link rel="stylesheet" href="/css/index.css">
				<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Smlep5jCw/wG7hdkwQ/Z5nLIefveQRIY9nfy6xoR1uRYBtpZgI6339F5dgvm/e9B"
				    crossorigin="anonymous">
				<link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
				<title>Dojo DMV</title>
			</head>

			<body>
				<h1>Welcome to the Dojo DMV License Creator!</h1>
				<p>
					<a href="persons/new">Add Person</a>
				</p>
				<p>
					<a href="license/new">Add License</a>
				</p>


				<h2>All Licenses</h2>
				<table class="table table-hover">
					<thead class="thead-dark">
						<tr class="info">
							<th scope="col">Name</th>
							<th scope="col">License Details</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${holders}" var="i">
							<c:if test="${i.license !=null}">
								<tr>
									<td>
										<a href="/show/${i.id}">${i.fName} ${i.lName}</a>
									</td>
									<td>${ i.license.state }</td>
									<td>
										<a class="btn-sm btn-danger" href="/delete/${i.id}" role="button">Delete</a>
									</td>
							</c:if>
							</tr>
						</c:forEach>

					</tbody>
				</table>

			</body>

			</html>