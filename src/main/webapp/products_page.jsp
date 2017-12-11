<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Locale locale = new Locale("ru");

    Object obj = session.getAttribute("locale");
    if (obj != null) {
        locale = (Locale) obj;
    }

    ResourceBundle myres = ResourceBundle.getBundle("messages", locale);

    String query = null;

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie c : cookies) {
            if ("query".equals(c.getName())) {
                query = c.getValue();
            }
        }
    }
    if (query != null) {
        request.setAttribute("query", query);
    }
%>
<html>
<head>
    <title>Product list</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript" src="/scripts/filter_input.js"></script>
</head>
<body>
<jsp:include page="top_menu.jsp"/>

<div class="top-container">
    <jsp:include page="main_menu.jsp"/>

    <div class="data-container">
        <p><%= myres.getString("FILTER") %>: <input id="filter_input" type="text" value="<%= query != null ? query : ""%>"/></p>
        <div id="products-list">
            <jsp:include page="/products_list.jsp"/>
        </div>

    </div>
</div>

</body>
</html>