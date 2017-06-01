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
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    <script src="/resources/js/controller.js"></script>
    <title>Produkty wszystkie</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/css/jquery.dataTables.css">
</head>
<body ng-app="cartApp">
<table id="example" ng-controller="cartCtrl" >
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
    <c:forEach items="${deals}" var="deal">
        <tr>
            <td>${deal.orderNumber}</td>
            <td>${deal.productName}</td>
            <td>${deal.dateFrom}</td>
            <td>${deal.dateTo}</td>
            <td>${deal.amount} ${deal.amountType}</td>
            <td>${deal.period}</td>
            <td>${deal.activ}</td>
            <td>  {{12/2}}</td>
            <td><a href=" <spring:url value="/deals/update/${deal.productName}" />"
                   class="btn btn-primary"> <span class="glyphicon-info-sign glyphicon"/></span> Edytuj </a></td>
            <td><a href="#" class="label label-danger" ng-click="remove('${deal.productName}')">
                <span class="glyphicon glyphicon-remove"/></span> Usuń </a></td>

        </tr>

    </c:forEach>
    </tbody>
</table>
<a href=" <spring:url value="/deals/add" />"
       class="btn btn-primary"> <span class="glyphicon-info-sign glyphicon"/></span> Dodaj Umowe </a>

<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.2.min.js"></script>
<script type="text/javascript" charset="utf8" src="http://ajax.aspnetcdn.com/ajax/jquery.dataTables/1.9.4/jquery.dataTables.min.js"></script>
<script>
    $(function(){
        $("#example").dataTable();
    })
</script>
</body>
</html>
