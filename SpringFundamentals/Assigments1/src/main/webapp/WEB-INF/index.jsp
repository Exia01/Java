<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="ISO-8859-1">
            <title>Home Page</title>
            <link rel="stylesheet" type="text/css" href="css/style.css">
            <script type="text/javascript" src="js/app.js"></script>
        </head>

        <body>
            <h1>Hello Human!</h1>
            <p>Welcome to Spring Boot!</p>

            <a href="/time">
                <button>Time </button>
            </a>
            <a href="/date">
                <button>Date</button>
            </a>

            <a href="/counter">
                <button>Visits!</button>
            </a>
            <p>
                <c:out value="${2+2}" />
            </p>

        </body>

        </html>