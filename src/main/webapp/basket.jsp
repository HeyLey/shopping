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

<ex:add_order id="${param.product_id}" color="${param.color}" size="${param.sz}"/>

<html>
<head>
    <title>Basket</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
</head>
<body>
<jsp:include page="top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="main_menu.jsp"/>
    <div class="data-container">
        <div class="basket">
            <c:forEach items="${basket.orders}" var="order">
                <div style="display: inline-block;">
                        ${order.product.name} <br/>
                    <img src="${order.product.img}" class="small-img"/> <br/>
                    <fmt:message key="COLOR"/>: ${order.color}<br/>
                    <fmt:message key="SIZE"/>: ${order.size}<br/>
                    <fmt:message key="PRICE"/>: ${order.product.price} руб.<br/>
                    <fmt:message key="NUMBER"/>: <c:out value="${order.number}"/> <br/> <br/>
                    <button class="small-buy-button" onclick="$.get('/remove?order_id=' + ${order.id}); window.location.href = '/basket.jsp';">
                        <fmt:message key="DELETE"/>
                    </button>
                    <br/> <br/> <br/>
                </div>
            </c:forEach>
        </div>

        <c:choose>
            <c:when test="${empty basket.orders}">
                <pre> <fmt:message key="BASKET_IS_EMPTY"/> </pre>
            </c:when>
            <c:otherwise>
                <div class="big-text"><fmt:message key="TOTAL_PRICE"/>: ${basket.totalPrice} руб.</div> <br/> <br/> <br/>
                <c:choose>
                    <c:when test="${empty pageContext.request.userPrincipal}">
                        <a href="secured/login.jsp"><fmt:message key="LOGIN"/></a>
                    </c:when>
                    <c:otherwise>
                        <a href="secured/order.jsp"><fmt:message key="MAKE_ORDER"/></a>
                    </c:otherwise>
                </c:choose>

            </c:otherwise>
        </c:choose>
    </div>
</div>
</body>
</html>