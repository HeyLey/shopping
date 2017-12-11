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

<ex:add_order id="${param.order_id}"/>

<html>
<head>
    <title>Personal page</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/timer.js"></script>
</head>
<body>
<jsp:include page="../top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="../main_menu.jsp"/>
    <div class="data-container"> <pre>
        <div id="datetime" class="big-text" style="text-align: right"></div>
        <div class="big-text">
     <fmt:message key="WELLCOME"/>, ${pageContext.request.userPrincipal.name}!</div>
        <div>
        Номер вкладки по умолчанию: ${initParam["default-tab"]}</div>

        <strong>

        Ваше имя:</strong>  Курбацкая Лейла
            <strong>
        Телефон:</strong>   +7 (911) 752-9100
            <strong>
        E-mail:</strong>    hey.ley@yandex.ru
            <strong>
        Адрес:</strong>     г.Санкт-Петербург, Кушелевская дорога, д.5, к.3, кв.51

        </pre>
        <div>
            <jsp:useBean id="orders" class="org.ley.hibernate.OrdersHistory"/>

            <c:forEach var="order" items="${orders.getOrders(pageContext.request.userPrincipal.name)}">
                <div class="item">
                    <h2>Заказ #${order.id}</h2>
                    <c:choose>
                        <c:when test="${order.delivery}">
                            Доставка курьером
                        </c:when>
                        <c:otherwise>
                            Самовывоз
                        </c:otherwise>
                    </c:choose>
                    <br/>
                    Адрес доставки: ${order.address}<br/>
                    Время: ${order.time} <br/>
                    <h2>Товары</h2>
                    <c:forEach items="${order.parts}" var="part">
                        <div style="display: inline-block;">
                                ${part.product.name} <br/>
                            <fmt:message key="PRICE"/>: ${part.product.price}  <fmt:message key="RUB"/>.<br/>

                            <img src="${part.product.img}" class="small-img"/> <br/>
                            <fmt:message key="NUMBER"/>: <c:out value="${part.number}"/> <br/>
                        </div>
                    </c:forEach>
                </div>
                <hr>
            </c:forEach>

        </div>
    </div>
</body>
</html>