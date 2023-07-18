<%@ page import="com.banksystem.onlinebankingsystem.Account.Account" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>

<html>
<head>
  <link href="${pageContext.request.contextPath}/WEB-INF/css/style.css" rel="stylesheet"/>
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
      List<Account> accountList = (List<Account>) request.getAttribute("list");
    %>

    <%
      for(Account a : accountList) {
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
    <% }%>
    </tbody>
    </table>
  <h2>





  </h2>

  <form action="/onlineBank" method="get">
    <input type="submit" name="myButton" value="Go Back to Main Page" />
  </form>
  </body>
</html>