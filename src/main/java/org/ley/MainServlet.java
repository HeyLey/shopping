package org.ley;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/html");
                response.setCharacterEncoding("UTF-8");

                       ServletOutputStream outputStream = response.getOutputStream();
               outputStream.println("Hello world!!!");
                outputStream.close();
            }

         }