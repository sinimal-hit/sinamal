package com.doer.response;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletTest04")
public class ServletTest04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("进入了ServletTest04");
        ServletContext servletContext = this.getServletContext();

        //参数是转发的路径
        RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/ServletTest01");
        requestDispatcher.forward(req,resp);//

    }
}
