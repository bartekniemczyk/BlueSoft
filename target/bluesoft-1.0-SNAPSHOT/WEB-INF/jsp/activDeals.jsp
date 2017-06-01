<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Bartek
  Date: 29.05.2017
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Aktywne produkty</title>
    <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
</head>
<body>
<table id="example">
    <thead>
    <tr>
        <th>Numer Zamówiena</th>
        <th>Nazwa Systemu</th>
        <th>Data Od</th>
        <th>Data Do</th>
        <th>Wplywy</th>
        <th>Okres</th>
        <th>AKTYWNA?</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${activeDeals}" var="active">
        <tr>
            <td>${active.orderNumber}</td>
            <td>${active.productName}</td>
            <td>${active.dateFrom}</td>
            <td>${active.dateTo}</td>
            <td>${active.amount} ${active.amountType}</td>
            <td>${active.period}</td>
            <td>${active.activ}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function(){
        $("#example").dataTable();
    })
</script>
</body>
</html>
