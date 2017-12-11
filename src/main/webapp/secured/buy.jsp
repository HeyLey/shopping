<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <title>Buy</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<ex:make_order address="${param.address}"
               delivery="${param.delivery}"
               user="${pageContext.request.userPrincipal.name}"/>

<jsp:include page="../top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="../main_menu.jsp"/>
    <div class="data-container">
        <div class="big-text">Заказ успешно оформлен.</div> <br/><pre>
Ожидайте звонка оператора.
История заказов доступна в личном кабинете. </pre>
    </div>

</div>

</body>
</html>
