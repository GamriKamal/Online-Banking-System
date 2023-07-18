<%--
  Created by IntelliJ IDEA.
  User: IRMAG
  Date: 13.07.2023
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href=src/main/webapp/WEB-INF/css/style.css>
    <title>Add New Account</title>
    <style><%@include file="/WEB-INF/css/add-new-account.css"%></style>

</head>
<body>
    <h2> Enter Your Data</h2>
    <div class="container">
        <form action="/addAccount" method="POST" class="column-container" >
            <label for="firstName">Enter First Name:</label >
            <input type="text" id="firstName" placeholder="Enter First Name" name="firstName" tabindex="1" autofocus>

            <label for="lastName">Enter Last Name:</label>
            <input type="text" id="lastName" placeholder="Last Name" name="lastName">

            <label for="cardNumber">Enter Card Number:</label>
            <input type="text" id="cardNumber" placeholder="Card Number" name="cardNumber">

            <label for="validityPeriod">Enter Validity Period:</label>
            <input type="text" id="validityPeriod" placeholder="Validity Period" name="validityPeriod">

            <label for="nameOfBank">Enter Name Of Bank:</label>
            <input type="text" id="nameOfBank" placeholder="Name Of Bank" name="nameOfBank">

            <label for="cvv">Enter CVV:</label>
            <input type="password" id="cvv" placeholder="CVV" name="cvv">

            <input id="textInput" name="myButton1" type="submit" value="Submit" >
        </form>
    </div>

    <form action="/onlineBank" method="get">
        <input type="submit" name="myButton" value="Go Back to Main Page" />
    </form>


</body>
</html>
