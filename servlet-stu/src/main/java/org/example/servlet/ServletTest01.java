package org.example.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * 通过实现Servlet接口,编写Servlet程序
 */
@WebServlet("/nihao")
public class ServletTest01 implements Servlet {
    public void init(ServletConfig config) throws ServletException {
        System.out.println("hello servlet");

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
