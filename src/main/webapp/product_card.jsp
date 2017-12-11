<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Карточка продукта</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/tabs.js"></script>
</head>
<body>
<jsp:include page="top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="main_menu.jsp"/>

    <jsp:include page="/product"/>
</div>

</body>
</html>
