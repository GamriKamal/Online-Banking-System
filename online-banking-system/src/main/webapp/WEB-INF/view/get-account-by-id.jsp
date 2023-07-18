<%@ page import="com.banksystem.onlinebankingsystem.Account.Account" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: IRMAG
  Date: 16.07.2023
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Accounts By ID</title>
    <style><%@include file="/WEB-INF/css/table.css"%></style>
</head>
<body>
<table border="3" class="center">
    <thead>
    <tr>
        <th>Account Id</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Card Number</th>
        <th>Validity Period</th>
        <th>Name Of Bank</th>
        <th>CVV</th>
    </tr>
    </thead>
    <tbody>
    <%
        Account a = (Account) request.getAttribute("account");
    %>
    <tr>
        <td><%=a.getAccountId()%></td>
        <td><%=a.getFirstName()%></td>
        <td><%=a.getLastName()%></td>
        <td><%=a.getCardNumber()%></td>
        <td><%= new SimpleDateFormat("MM/yyyy").format(a.getValidityPeriod())%></td>
        <td><%=a.getNameOfBank()%></td>
        <td><%=a.getCVV()%></td>
    </tr>
    </tbody>
</table>
<h2>





</h2>
<form action="/onlineBank" method="get">
    <input type="submit" name="myButton" value="Go Back to Main Page" />
</form>
</body>
</html>
