<%--
  Created by IntelliJ IDEA.
  User: ricardoayala
  Date: 3/9/23
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username == null || password == null) {
    }
     else if (username.equals("admin") && password.equals("password")) {
        response.sendRedirect("/profile.jsp");
    } else {
        response.sendRedirect("/login.jsp");
    }
%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form name="userLogin" action="/login.jsp" method="POST">
    <label>
        Username:
        <input type="text" name ="username">
    </label>
    <label>
        Password:
        <input type="password" name="password">
    </label>
    <button>Submit</button>
</form>

</body>
</html>
