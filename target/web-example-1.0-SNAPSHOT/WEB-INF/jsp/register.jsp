<%--
  Created by IntelliJ IDEA.
  User: huynhnguyen
  Date: 23/06/2018
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<h2>Register Forms</h2>

<form action="register" method="post">
    user name:<br>
    <input type="text" name="userName">
    <br>
    password:<br>
    <input type="password" name="password">
    <br>
    re password:<br>
    <input type="password" name="repassword">
    <br>
    email:<br>
    <input type="text" name="email">
    <br><br>
    <input type="submit" value="Register">
</form>
</body>
</html>
