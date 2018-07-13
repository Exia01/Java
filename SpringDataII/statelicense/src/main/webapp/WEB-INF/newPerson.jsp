<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <link rel="stylesheet" href="/css/index.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
                <title>New Person</title>
            </head>

            <body>
                <div class="container">
                    <div class="box1">
                        <h1>New Person</h1>
                        <br>
                        <form:form action="/addperson" method="POST" modelAttribute="new">
                            <div class="form-group">
                                <form:label path="fName">First Name
                                    <br>
                                    <form:input path="fName"></form:input>
                                    <br>
                                    <div class="red">
                                        <form:errors path="fName"></form:errors>
                                    </div>
                                </form:label>
                            </div>
                            <br>
                            <div class="form-group">
                                <form:label path="lName">Last name
                                    <br>
                                    <form:input path="lName"></form:input>
                                    <br>
                                    <div class="red">
                                        <form:errors path="lName"></form:errors>
                                    </div>
                                </form:label>
                            </div>
                            <br>
                            <br>
                            <button type="submit" class="btn btn-success">Create</button>
                        </form:form>
                        <br>
                        <a href="/">
                            <button class="btn btn-info">Go back</button>
                        </a>
                    </div>

                </div>
            </body>

            </html>