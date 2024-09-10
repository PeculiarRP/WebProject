<%@ page import="java.util.List" %>
<%@page import="com.example.webproject.models.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список рандомных людей</title>
</head>
<body>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Имя</th>
            <th>Фамилия</th>
            <th>Возраст</th>
            <th>Работа</th>
            <th>Образование</th>
        </tr>
    <thead>
    <tbody>
        <%
            List<String> list = (List<String>)request.getAttribute("people");

        %>>
    </tbody>
</table>
</body>
</html>
