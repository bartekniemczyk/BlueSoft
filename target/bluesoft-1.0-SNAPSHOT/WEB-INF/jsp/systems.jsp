<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Bartek
  Date: 29.05.2017
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Systemy</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css"
          href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
</head>
<body>

<table id="example">
    <thead>
    <tr>
        <th>Nazwa</th>
        <th>Opis Systemu</th>
        <th>Opis Technologii</th>
        <th>Wlasciciel</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${system}" var="systemy">
        <tr>

            <td>${systemy.name}</td>
            <td>${systemy.systemDesc}</td>
            <td>${systemy.techDesc}</td>
            <td>${systemy.owner}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>


<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8"
        src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function () {
        $("#example").dataTable();
    })
</script>
</body>
</html>
