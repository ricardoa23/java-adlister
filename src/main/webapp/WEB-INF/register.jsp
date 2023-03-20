<%--
  Created by IntelliJ IDEA.
  User: ricardoayala
  Date: 3/17/23
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<form method="POST">
    <label for="username">username</label>
    <input type="text" name="username" id="username">
    <br>
    <label for="email">Email</label>
    <input type="email" name="email" id="email">
    <br>
    <label for="password">Password</label>
    <input type="password" name="password" id="password">
    <br>
    <label for="passwordConfirmation">Please re-enter your Password</label>
    <input type="password" name="passwordConfirmation" id="passwordConfirmation">
    <br>
    <button>Register</button>
</form>
</body>
</html>
