<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ricardoayala
  Date: 3/14/23
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads index</title>
</head>
<body>
<h1>Ads</h1>
<c:forEach var="ad" items="${ads}">
    <div>
        <h3>${ad.title}</h3>
        <p>${ad.description}</p>
        <p>Posted by: ${ad.userId}</p>
    </div>
    <br>
</c:forEach>

</body>
</html>
