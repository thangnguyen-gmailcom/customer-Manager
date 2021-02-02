<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TTC
  Date: 2/2/2021
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <title>Create Customer</title>
</head>
<body>
<h2> Create Customer</h2>
<p>
    <a href='<c:url value="/"/>'>Back</a>
</p>
<c:if test="${message != null}">
    <span class="text-success">${message}</span>
</c:if>
<form action="addCustomer" method="post">
    <div class="form-group">
        <label for="exampleInputEmail1">Full Name</label>
        <input type="text" name="name" value="${customer.fullName}" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
               placeholder="Enter Full Name">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Email</label>
        <input type="email" name="email" value="${customer.email}" class="form-control" id="exampleInputPassword1" placeholder="Email">
    </div>
    <div class="form-group">
        <label for="exampleInputPassword1">Address</label>
        <input type="text" name="address" value="${customer.address}" class="form-control" id="exampleInputPassword2" placeholder="Address">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>
