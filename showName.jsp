<%--
  Created by IntelliJ IDEA.
  User: mac
  Date: 10/12/2018 AD
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<style>

    h1{

        color: red;
        background-color: aqua;
        padding: 48px;
        font-size: 48px;


    }

</style>

<body>

<h1>Welcome



    <% out.print(request.getAttribute("N"));out.print(request.getAttribute("F"));%>



</h1>

<a href="/">Back</a>

</body>
</html>
