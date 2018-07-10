<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Index</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script src="js/main.js"></script>
        <style> span {color:red}</style>
    </head>

    <body>
     <span>  <c:out value="${error}" /></span>
        <form class="code" action="/word" method="POST">
            <h2>What is the code?</h2>
            <input type="text" name="code">
            <button type="submit">Try Code</button>
        </form>
    </body>

    </html>