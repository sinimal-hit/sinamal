package com.doer.servletContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletTest02")
public class ServletContextTest01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.getInitParameter() 初始化参数
        //this.getServletConfig() //Servlet配置
        //this.getServletContext() Servlet上下文
        ServletContext servletContext =  this.getServletContext();
        String username = "doer";//数据
        servletContext.setAttribute("username",username); //将一个数据保存到ServletContext中


    }
}
