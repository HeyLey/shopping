
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout done</title>
</head>
<body>
<%session.invalidate();%>
<h1>Успешный выход</h1>
<a href="/products_page.jsp">Список продуктов</a><br/>
</body>
</html>
