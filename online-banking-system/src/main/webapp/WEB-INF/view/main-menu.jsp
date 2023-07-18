<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Main Menu IRMAG Bank</title>
    <script>
        function showText() {
            var text = document.getElementById("textInput").value;
            document.getElementById("displayText").innerHTML = text;
            document.getElementById("textInput").value = "";
        }
    </script>
</head>
<style><%@include file="/WEB-INF/css/main-menu.css"%></style>
<body>
    <h2>Get All Accounts</h2>
    <form action="/accounts" method="get">
        <input type="submit" name="myButton" value="Get Table" />
    </form>

    <h2></h2>

    <h2>Get Account By Id</h2>
    <form action="/getAccountById" method="get">
        <label for="account_id">Enter ID:</label>
        <input type="text" id="account_id" name="account_id" placeholder="Type your id here">
        <input type="submit" value="Get" name="button">
    </form>

    <h2></h2>

    <h2>Add new Account</h2>
    <form action="/addAccount" method="get">
        <input type="submit" name="myButton" value="Add new Account" />
    </form>


    <h2></h2>

    <h2>Delete Account</h2>
    <form action="/deleteAccountById" method="get">
        <label for="acc_id">Enter ID:</label>
        <input type="text" id="acc_id" name="acc_id" placeholder="Type your id here">
        <input onclick="toggleTextVisibility()" type="submit" value="Delete" name="buttonDel" >
        <p id="hiddenText" style="display: none;"><span>Complete!</span></p>
    </form>

</body>
</html>