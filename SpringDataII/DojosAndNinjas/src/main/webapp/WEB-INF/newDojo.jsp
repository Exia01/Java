<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>New Dojo</title>
                <link rel="stylesheet" href="/css/new.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
            </head>

            <body>
                <div class="container">

                    <h1>New Dojo!</h1><br>
                    
			                <a href="/dojos" class="btn btn-success">Dashboard</a>
							<a href="/ninjas/new" class="btn btn-success">New Ninja</a>
                    <hr>
                    <br>
                    <br>
                   	<form:form action="/dojos/processdojo" method="POST" modelAttribute="dojo" class="form-group">
								<form:label path="name">Dojo Location</form:label>
								<br>
								<form:input path="name"></form:input><br>
								<form:errors path="name"></form:errors>
								<br>
								<button type="submit" class="btn btn-info">Submit</button>
					</form:form>

                </div>

            </body>

            </html>