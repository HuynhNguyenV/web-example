<%--
  Created by IntelliJ IDEA.
  User: huynhnguyen
  Date: 11/06/2018
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form action="login" method="post">
    Name: <br/>
    <input type="text" name="userName"/><br/>
    Password: <br/>
    <input type="password" name="userPass"/><br/>
    <input type="submit" value="login"/>
    <a href="register">Register</a>
</form>
</body>
</html>
