<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="ISO-8859-1">
                <link rel="stylesheet" href="/css/index.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="https://fonts.googleapis.com/css?family=Encode+Sans+Condensed:600" rel="stylesheet">
                <title>New License</title>

            </head>

            <body>
                <div class="container">
                    <div class="box1">
                        <h1>New License</h1>
                        <br>
                        <div class="form-group">
                            <form:form method="POST" action="/newlicense" modelAttribute="generate">
                                <p>Person</p>
                                <form:select path="person">
                                    <c:forEach items="${people}" var="x">
                                        <c:if test="${x.license ==null}">
                                            <form:option value="${x.id}">${x.fName} ${x.lName}</form:option>
                                        </c:if>
                                    </c:forEach>
                                </form:select>
                                <br>
                                <br>
                                <form:label path="state">State
                                    <form:errors path="state" />
                                    <form:input path="state" /></form:label>
                                <br>
                                <br>

                                <input type="submit" class="btn btn-success" value="Create" />
                            </form:form>
                        </div>

                        <a href="/">
                            <button class="btn btn-info">Go back</button>
                        </a>
                    </div>
                </div>

            </body>

            </html>