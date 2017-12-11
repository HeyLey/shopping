<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="product" class="org.ley.Product" scope="request"/>
<%

    Locale locale = new Locale("ru");

    Object obj = session.getAttribute("locale");
    if (obj != null) {
        locale = (Locale) obj;
    }

    ResourceBundle myres = ResourceBundle.getBundle("messages", locale);
%>
<div class="product-preview-div">
    <br/>
    <br/>
    <jsp:getProperty name="product" property="name"/> <br/>
    <!-- ссылка на карточку продукта -->
    <a href="/product_card.jsp?id=<jsp:getProperty name="product" property="id"/>">
        <img src="<jsp:getProperty name="product" property="img"/>" class="small-img"/></a>
    <br/>
    Цена: <jsp:getProperty name="product" property="price"/> руб.
    <br/>
    <br/>
    <a href="/product_card.jsp?id=<jsp:getProperty name="product" property="id"/>">
        <%= myres.getString("BUY_BUTTON") %></a>
    <br/>
    <br/>
    <br/>
</div>