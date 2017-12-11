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
    <title>Auth</title>
</head>
<body>
<pre>
<form action="j_security_check" method="POST" name="loginForm">
    <input type="text" name="j_username" placeholder="<fmt:message key="LOGIN_NAME"/>" size="20"/>
    
    <input type="password" name="j_password" placeholder="<fmt:message key="LOGIN_PASSWORD"/>" size="20"/>



    <input type="submit" value="<fmt:message key="LOGIN"/>"/>

</form> </pre>
</body>
</html>