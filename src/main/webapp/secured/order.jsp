<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="ex" uri="/WEB-INF/custom.tld" %>

<c:if test="${empty sessionScope.lang}">
    <fmt:setLocale value="ru"/>
</c:if>

<c:if test="${sessionScope.lang eq 'ru'}">
    <fmt:setLocale value="ru"/>
</c:if>

<c:if test="${sessionScope.lang eq 'en'}">
    <fmt:setLocale value="en"/>
</c:if>

<c:if test="${sessionScope.lang eq 'de'}">
    <fmt:setLocale value="de"/>
</c:if>

<fmt:setBundle basename="/messages"/>
<html>
<head>
    <title>Order</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="//api-maps.yandex.ru/2.1/?lang=ru_RU" type="text/javascript"></script>
    <script src="/scripts/maps.js" type="text/javascript"></script>
    <style>
        #map {
            width: 60%;
            height: 60%;
            padding: 0;
            margin: 0;
        }
    </style>
</head>
<body>
<jsp:include page="../top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="../main_menu.jsp"/>
    <div class="data-container">
        <h1><fmt:message key="YOUR_ORDER"/></h1>
        <div class="basket">
            <c:forEach items="${basket.orders}" var="order">
                <div style="display: inline-block;">
                        ${order.product.name} <br/>
                    <img src="${order.product.img}" class="small-img"/> <br/>
                    <fmt:message key="COLOR"/>: ${order.color}<br/>
                    <fmt:message key="SIZE"/>: ${order.size}<br/>
                    <fmt:message key="NUMBER"/>:<c:out value="${order.number}"/> <br/>
                    <hr>
                </div>
            </c:forEach>

        </div>
        <div class="big-text"><fmt:message key="TOTAL_PRICE"/>: ${basket.totalPrice}</div>

        <form action="/secured/buy.jsp" method="post">
            <br/><br/>
            <input id = "radio1" type="radio" name="delivery" value="false"> Самовывоз<br> <br/>
            <h2><fmt:message key="SELECT_SHOP_ON_MAP"/></h2>
            <div id="map"></div> <br/><br/><br/>
            <input type="radio" name="delivery" value="true"> Доставка курьером<br> <br/> <br/>

            При выборе пункта "доставка курьером" укажите в поле ниже Ваш подробный адрес, включая индекс.
            <br/> <br/>
            <textarea id = "address" name = "address" rows="4" cols="50">Адрес доставки</textarea><br/> <br/> <br/>
            <input type="submit" class="small-buy-button" value="<fmt:message key="MAKE_ORDER"/>">
        </form>
    </div>
</body>
</html>

