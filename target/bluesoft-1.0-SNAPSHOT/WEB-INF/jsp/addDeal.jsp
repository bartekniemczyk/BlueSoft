<%--
  Created by IntelliJ IDEA.
  User: Bartek
Date: 29.05.2017
Time: 15:26
To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Produkty</title>
</head>

<body>
<section>
    <div class="jumbotron">

        <div class="container"><h1>Produkty</h1>
            <p>Dodaj produkty</p></div>
    </div>
</section>
<section class="container">
    <form:form modelAttribute="newDeal"
               class="form-horizontal">
        <fieldset>
            <legend>Dodaj nowy produkt</legend>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="productName">
                    <spring:message code="addProduct.form.systemNazwa.label"/> </label>
                <div class="col-lg-10">
                    <form:input id="productName" path="productName"
                                type="text" class="form:input-large"/>

                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="orderRequest">
                    <spring:message code="addProduct.form.zapotrzebowanie.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input id="orderRequest" path="orderRequest" type="number"
                                rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="orderNumber">
                    <spring:message code="addProduct.form.numerzamowienia.label"/>
                </label>
                <div class="col-lg-10">
                    <form:input id="orderNumber" path="orderNumber"
                                type="text" rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="dateFrom">
                    <spring:message code="addProduct.form.dataOD.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="dateFrom" path="dateFrom"
                                type="text"  rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="dateTo">
                    <spring:message code="addProduct.form.dataDo.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="dateTo" path="dateTo"
                                type="text"  rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="amount">
                    <spring:message code="addProduct.form.wplyw.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="amount" path="amount" type="number"
                                rows="2"/>
                </div>
            </div>


            <div class="form-group">
                <label class="control-label col-lg-2" for="amountType">
                    <spring:message code="addProduct.form.wplywRodzaj.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="amountType" path="amountType"
                                type="text" rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="amountType">
                    <spring:message code="addProduct.form.skala.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="period" path="period"
                                type="text" rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="amountType">
                    <spring:message code="addProduct.form.procent.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="percent" path="percent"
                                type="number" rows="2"/>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2" for="amountType">
                    <spring:message code="addProduct.form.aktywnosc.label"></spring:message>
                </label>
                <div class="col-lg-10">
                    <form:input id="activ" path="activ"
                                type="text" rows="2"/>
                </div>
            </div>

            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10">
                    <input type="submit" id="btnAdd" class="btn btn-primary" value="Dodaj"/>
                </div>
            </div>
        </fieldset>
    </form:form>
</section>
</body>
</html>
