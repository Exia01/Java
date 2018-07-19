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
					<h1 class="font-weight-bold">Questions Dashboard</h1>
					<p class="green"><c:out value="${questionsuccess}"/></p>
					<table class="table table-hover">
						<thead class="thead-dark">
							<tr class="info">
								<th scope="col">Question</th>
								<th scope="col">Tags</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${questions}" var="i">
								<tr>
									<td>
										<a href="/questions/${i.id}">${i.questionName}</a>
									</td>
									<c:forEach items="${i.tags}" var="tag">
										<td>${ tag.name }</td>
									</c:forEach>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<a class="btn btn-success" href="questions/new" role="button">New Question</a>
				</div>
			</body>

			</html>