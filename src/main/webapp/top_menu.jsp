<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

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

<ul class="top-menu">
    <div class="about">
        <li class="dropdown-top">
            <a class="dropdown-top"><fmt:message key="ABOUT"/></a>
            <ul class="dropdown-inside">
                <li><a href="/menu/services.jsp"><fmt:message key="SERVICE"/></a></li>
                <li><a href="/menu/offer.jsp"><fmt:message key="TENDER"/></a></li>
                <li><a href="/menu/support.jsp"><fmt:message key="SUPPORT_CENTER"/></a></li>
                <li><a href="/menu/contacts.jsp"><fmt:message key="CONTACT"/></a></li>
                <li><a href="/menu/job.jsp"><fmt:message key="JOBS"/></a></li>
            </ul>
        </li>

        <li class="dropdown-top">
            <a class="dropdown-top"><fmt:message key="DELIVERY"/></a>
            <ul class="dropdown-inside">
                <li><a href="/menu/delivery.jsp">Условия доставки</a></li>
                <li><a href="/menu/regions.jsp">Доступные регионы</a></li>
            </ul>
        </li>

        <li class="dropdown-top">
            <a class="dropdown-top"><fmt:message key="RETURN"/></a>
            <ul class="dropdown-inside">
                <li><a href="/menu/return.jsp">Условия возврата</a></li>
                <li><a href="/menu/conditions.jsp">Как оформить</a></li>
            </ul>
        </li>
        <script src="/scripts/language.js"></script>
        <div class="lang">
            <li><a href="#" onclick="changeLanguage('ru');" class="dropdown-top">Русский</a></li>
            <li><a href="#" onclick="changeLanguage('en');" class="dropdown-top">English</a></li>
            <li><a href="#" onclick="changeLanguage('de');" class="dropdown-top">Deutsch</a></li>
        </div>
        <div class="corb">
            <ul>
                <c:choose>
                    <c:when test="${not empty pageContext.request.userPrincipal}">
                        <li>
                            <a href="/secured/personal_cabinet.jsp"><fmt:message key="USER"/>: ${pageContext.request.userPrincipal.name}</a>
                        </li>
                        <li><a href="/secured/logout.jsp"><fmt:message key="LOGOUT"/></a></li>
                    </c:when>
                    <c:otherwise>
                        <li><a href="/secured/personal_cabinet.jsp"><fmt:message key="LOGIN"/></a></li>
                    </c:otherwise>
                </c:choose>

                <li><a href="/basket.jsp"><fmt:message key="BASKET"/></a></li>
                <c:if test="${not empty basket.orders}">
                    <c:if test="${not empty pageContext.request.userPrincipal}">
                        <li><a href="/secured/order.jsp"><fmt:message key="MAKE_ORDER"/></a></li>
                    </c:if>
                </c:if>

            </ul>
        </div>
    </div>
</ul>