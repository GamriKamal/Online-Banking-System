<%--
  Created by IntelliJ IDEA.
  User: IRMAG
  Date: 18.07.2023
  Time: 13:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error!</title>
</head>
<style><%@include file="/WEB-INF/css/main-menu.css"%></style>
<body>
    <h1>Error</h1>
    <p>${error}</p>

    <form action="/onlineBank" method="get">
        <input type="submit" name="myButton" value="Go Back to Main Page" />
    </form>
</body>
</html>
