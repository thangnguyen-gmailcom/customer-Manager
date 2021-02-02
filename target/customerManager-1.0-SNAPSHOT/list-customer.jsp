<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TTC
  Date: 2/2/2021
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <title>Customer Manager</title>
</head>
<body>
<h2>Customer Manager</h2>
<table class="table">
    <thead class="thead-light">
    <tr>
        <th scope="col">Id</th>
        <th scope="col">FullName</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
        <th scope="col"></th>
        <th scope="col"></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}">
    <tr>
        <th scope="row">${customer.getId()}</th>
        <td>${customer.getFullName()}</td>
        <td>${customer.getEmail()}</td>
        <td>${customer.getAddress()}</td>
        <td><a href="/editCustomer?id=${customer.getId()}">Edit</a></td>
        <td><a onclick="return confirm('Ban có muốn xóa không?');" href="/deleteCustomer?id=${customer.getId()}">Delete</a></td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<p><a href="addCustomer">Create Customer</a></p>
</body>
</html>
