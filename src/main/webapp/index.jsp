<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<jsp:include page="view/nav-panel.jsp">
  <jsp:param name="curTable" value="home"/>
</jsp:include>
  <h1><%= "Hello World! jsp" %></h1>
</body>
</html>