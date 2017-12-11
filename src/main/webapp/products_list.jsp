<%@ page import="org.ley.Product" %>
<%@ page import="org.ley.ProductsProvider" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String category = request.getParameter("category");

    String query = request.getParameter("query");
    if (query != null) {
        Cookie cookie = new Cookie("query", query);
        response.addCookie(cookie);
    } else {
        query = (String) request.getAttribute("query");
    }

    for (Product product : ProductsProvider.getProducts(category, query)) {
        request.setAttribute("product", product);
%>
<jsp:include page="/product.jsp"/>
<% } %>
