package org.ley;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Locale;


public class LanguageServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        String lang = request.getParameter("lang");

        Locale locale = new Locale("ru");

        if (lang.startsWith("en")) {
            locale = Locale.ENGLISH;
        }

        if (lang.startsWith("de")) {
            locale = Locale.GERMAN;
        }

        HttpSession session = request.getSession();

        session.setAttribute("locale", locale);
        session.setAttribute("lang", locale.getLanguage());
    }
}