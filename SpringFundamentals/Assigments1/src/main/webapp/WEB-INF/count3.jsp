<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
                <!DOCTYPE html>
                <html>

                <head>
                        <meta charset="ISO-8859-1">
                        <title>Insert title here</title>
                </head>

                <body>
                        <h1>You have visited
                                <a href="/">http://localhost:8080/</a>
                                <c:out value="${count}" />times. Nice the number increase's by 3</h1>
                        <h2>
                                <a href="/"> Test another visit?</a>
                        </h2>
                        <h2>
                                <a href="/reset">Reset Visits</a>
                        </h2>

                </body>

                </html>