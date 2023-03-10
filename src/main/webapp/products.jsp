<%@ page import="model.Product" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: ricardoayala
  Date: 3/10/23
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%


  Product p1 = new Product("Snickers Bar", 250);
  Product p2 = new Product("Snickers Bar", 250);
  Product p3 = new Product("Snickers Bar", 250);
  ArrayList<Product> products = new ArrayList<Product>(){};
  products.add(p1);
  products.add(p2);
  products.add(p3);


  request.setAttribute("products", products);

%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<jsp:include page="partials/navbar.jsp" />

<h1>Products Page</h1>
<br>
<c:forEach var="product" items="${products}">
  <div>
  <h3>${product.name}</h3>
  <h3>${product.costInCents}</h3>
  </div>
</c:forEach>

<jsp:include page="partials/footer.jsp" />

</body>
</html>
