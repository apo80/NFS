<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>


  <style>

    input{
      color: royalblue;
      background-color: white;
      padding: 5px;
      font-size: 16px;

    }
    button{
      color: red;
    }


  </style>

  <body>

  <form method="post" action="/showName/">


    Name:
    <input type="text" name="Name">
    <br>
    Family:
    <input type="text" name="Family">
    <br>
    <button type="submit">Show</button>

  </form>

  <form method="get" action="/showCookie/">
<br>
    <button type = "submit">Saved!</button>

  </form>


  </body>
</html>