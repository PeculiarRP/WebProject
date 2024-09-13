<%--
  Created by IntelliJ IDEA.
  User: navip
  Date: 11.09.2024
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="../WEB-INF/nav-panel.css"%>
</style>
<nav>
    <a href="/">Home</a>
    <a href="/table-servlet">Таблица людей</a>
    <a href="#">Blog</a>
    <a href="#">Portefolio</a>
    <a href="#">Contact</a>
    <div class="animation start-${param.curPage}"></div>
</nav>
