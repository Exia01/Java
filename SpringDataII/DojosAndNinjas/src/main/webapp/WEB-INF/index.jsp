<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Dojo Page</title>
                <link rel="stylesheet" href="/css/index.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Knewave|Raleway" rel="stylesheet">
            </head>

            <body>

                <div class="container">
                    <h1>${dojo.name}'s Ninjas</h1><br>
                    <table class="table table-hover">
                        <tr class="info">
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Age</th>
                        </tr>
                        <c:forEach items="${dojo.ninjas}" var="i">
                        <tr>
                        	
								<td><c:out value="${i.fname}"/></td>
	                            <td><c:out value="${i.lname}"/></td>
	                            <td><c:out value="${i.age}"/></td>
                            
                        </tr>
                        </c:forEach>
                    </table>
				<a href="/dojos/new" class="btn btn-success">New Dojo</a>
				<a href="/ninjas/new" class="btn btn-success">New Ninja</a>
                </div>

            </body>

            </html>