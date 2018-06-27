<%--
  Created by IntelliJ IDEA.
  User: huynhnguyen
  Date: 27/06/2018
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Giai Phuong Trinh</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <h2>Giai Phuong Trinh Bac Hai</h2>
    <form class="form-horizontal" action="phuongtrinhbachai" method="post">
        <div class="form-group">
            <label class="control-label col-sm-2">He So A: </label>
            <div class="col-sm-6">
                <input type="number" class="form-control" name="txtA">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2">He So B: </label>
            <div class="col-sm-6">
                <input type="number" class="form-control" name="txtB">
            </div>
        </div>
        <div class="form-group">
            <label class="control-label col-sm-2">He So C: </label>
            <div class="col-sm-6">
                <input type="number" class="form-control" name="txtC">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
    <h2 style="color: red">${sessionScope.message}</h2>
</div>
</body>
</html>
