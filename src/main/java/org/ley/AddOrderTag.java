package org.ley;

import org.ley.bean.Basket;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

// добавление в корзину через jsp

public class AddOrderTag extends SimpleTagSupport {
    private String id;
    private String color;
    private String size;


    public void setId(String id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void doTag() throws JspException, IOException {
        if (id == null || id.isEmpty()) {
            return;
        }

        int id = Integer.parseInt(this.id);

        Basket basket = (Basket) getJspContext().getAttribute("basket", PageContext.SESSION_SCOPE);

        if (basket == null) {
            basket = new Basket();
            getJspContext().setAttribute("basket", basket, PageContext.SESSION_SCOPE);
        }
        basket.addOrder(id, color, size);
    }


}
