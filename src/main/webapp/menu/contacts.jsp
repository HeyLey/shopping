<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contacts</title>
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
        <div class=simple-text>
        <pre>
        <strong>
        Телефоны и адреса магазинов: </strong>

        - г. Санкт-Петербург, ул. Харченко, 19. Тел: 295-06-56
        - г. Санкт-Петербург, ул. Профессора Попова, 4. Тел: 236-89-43

        <div id="map"></div>

        Для звонков из регионов: 8 (800) 333-14-48

        Также нам всегда можно написать на <em>imymeshop@ya.ru</em>. </pre>

        </div>
    </div>
</div>
</body>
</html>
