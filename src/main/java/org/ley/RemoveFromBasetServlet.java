package org.ley;

import org.ley.bean.Basket;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class RemoveFromBasetServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        int orderId = Integer.parseInt(request.getParameter("order_id"));

        Basket basket = (Basket) request.getSession().getAttribute("basket");

        if (basket != null) {
            basket.remove(orderId);
        }

    }
}
