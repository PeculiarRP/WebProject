<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.stream.Stream" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="com.example.webproject.models.Films" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>
    <%@ include file="../WEB-INF/film-cards.css"%>
</style>
<head>
    <title>Карточка</title>
</head>
<body>
    <div class="cards">
        <c:forEach var="film" items="${requestScope.films}">
            <c:set var="film" value="${film}" scope="request"/>
            <jsp:include page="film-card.jsp"/>
        </c:forEach>
    </div>
</body>
</html>
