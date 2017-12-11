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

<ul class="main-menu">
    <li><a href="/products_page.jsp?category=FOR_WOMAN">Для женщин</a></li>
    <ul class="sub-menu">
        <li><a href="/products_page.jsp?category=WOMAN_DRESS">Платья</a></li>
        <li><a href="/products_page.jsp?category=WOMAN_SKIRT">Юбки</a></li>
        <li><a href="/products_page.jsp?category=WOMAN_PANTS">Брюки</a></li>
        <li><a href="/products_page.jsp?category=WOMAN_BLOUSE">Блузки</a></li>
        <li><a href="/products_page.jsp?category=WOMAN_COAT">Верхняя одежда</a></li>
        <li><a href="/products_page.jsp?category=WOMAN_SHOES">Обувь</a></li>
    </ul>
    <li><a href="/products_page.jsp?category=FOR_MEN">Для мужчин</a></li>
    <ul class="sub-menu">
        <li><a href="/products_page.jsp?category=MEN_JACKET">Пиджаки</a></li>
        <li><a href="/products_page.jsp?category=MEN_PANTS">Брюки</a></li>
        <li><a href="/products_page.jsp?category=MEN_SHIRT">Рубашки</a></li>
        <li><a href="/products_page.jsp?category=MEN_POLO">Футболки</a></li>
        <li><a href="/products_page.jsp?category=MEN_COAT">Верхняя одежда</a></li>
        <li><a href="/products_page.jsp?category=MEN_SHOES">Обувь</a></li>
    </ul>
    <li><a href="/products_page.jsp">Все товары</a></li>
</ul>