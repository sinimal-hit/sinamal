package com.doer.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 通过session共享数据,获取session
 */
@WebServlet("/session02")
public class SessionTest02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题,
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到Session
        HttpSession session = req.getSession();

        String  name = (String) session.getAttribute("name");
        System.out.println(name);

    }
}
