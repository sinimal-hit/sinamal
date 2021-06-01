package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码格式
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //响应格式
        resp.setContentType("text/html");

        //解析请求,header,method,url,请求数据
        //通过键获取值,如果该键没有值,就返回null
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter pw = resp.getWriter();
        //真实的业务应该是数据库根据查询的用户输入的账号和密码,查询在用户的输入数据中查询有没有用户输入的该数据
        if("abc".equals(username) && "123".equals(password)){
            pw.println("<h1>欢迎您:"+username+"</h1>");
        }else {
            pw.println("用户名密码错误</h1>");
        }
    }


}
