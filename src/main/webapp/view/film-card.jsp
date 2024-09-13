<%@ page import="com.example.webproject.models.Films" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    <%@include file="../WEB-INF/film-card.css"%>
</style>
<%
    Films film = (Films) request.getAttribute("film");
%>
<div class="card">
    <div class="card-top">
        <h1 class="card-name">
            <%
                out.println(film.getFilmName());
            %>
        </h1>
        <a href="#" class="card-image">
            <img src="" alt="">
        </a>
    </div>
    <div class="card-bottom">
        <div>
            <a class="description" href="#">
                <%
                    out.println(film.getFilmDescription());
                %>
            </a>
        </div>
    </div>
</div>
