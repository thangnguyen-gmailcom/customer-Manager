<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <title>Edit Customer</title>
</head>
<body>
<h2> Edit Customer</h2>
<p>
    <a href='<c:url value="/"/>'>Back</a>
</p>
<c:if test="${message != null}">
    <span class="text-success">${message}</span>
</c:if>
<form action="editCustomer" method="post">
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
    <input type="hidden" name="id" value="${customer.id}"/>
<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
    <input type="submit" class="btn btn-primary" value="Submit" />
</body>
</html>
