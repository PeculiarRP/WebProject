<%@ page import="java.util.List" %>
<%@ page import="com.example.webproject.models.Person" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список рандомных людей</title>
</head>
<style>
    <%@ include file="../WEB-INF/table.css"%>
</style>
<body>
<jsp:include page="nav-panel.jsp">
    <jsp:param name="curPage" value="table"/>
</jsp:include>
<h1 id="page-table-title">Таблица людей</h1>
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
            List<Person> people = (List<Person>) request.getAttribute("people");
            if (people != null && !people.isEmpty()){
                for (Person p: people){
                    out.println("<tr>" +
                            "<td>" + p.getUuid() + "</td>" +
                            "<td>" + p.getName() + "</td>" +
                            "<td>" + p.getSurname() + "</td>" +
                            "<td>" + p.getAge() + "</td>" +
                            "<td>" + p.getWork() + "</td>" +
                            "<td>" + p.getEducation() + "</td>"
                            + "</tr>");
                }
            }
        %>
    </tbody>
</table>
</body>
</html>
