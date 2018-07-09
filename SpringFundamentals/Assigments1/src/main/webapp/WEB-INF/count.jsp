<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>counter</title>
        </head>

        <body>
            <h1>You have visited
                <a href="/">http://localhost:8080/</a>
              <c:out value="${count}" /> times. </h1>
            <a href="/">
                <button> Test another visit?</button>
            </a>
            <a href="/counter2">
                <button> Visit Twice!!</button>
            </a>
            <a href="/counter3">
                <button> Visit 3 Times!!</button>
            </a>
            <a href="/reset">
                <button>Reset Visits</button>
            </a>

        </body>

        </html>