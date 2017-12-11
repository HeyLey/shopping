package org.ley;


import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;

//логгирование действий пользователя

public class LogFilter implements Filter {
    private ServletContext context;

    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;

        String ip = httpReq.getRemoteAddr();

        String uri = httpReq.getRequestURI();

        StringBuilder builder = new StringBuilder();

        for (String name : Collections.list(httpReq.getParameterNames())) {
            builder.append(name).append(": ").append(httpReq.getParameter(name)).append("\n");
        }

        context.log("ip: " + ip + ", uri: " + uri + ", parameters: [\n" + builder +"]");

        filterChain.doFilter(request, response);
    }

    public void destroy() {

    }

    public void init(FilterConfig сonfig) throws ServletException {
        context = сonfig.getServletContext();
    }
}

