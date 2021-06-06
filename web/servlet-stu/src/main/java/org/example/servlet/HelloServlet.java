package org.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Servlet的作用:
 *      解析http请求,返回http响应,以代码的方式提供服务资源(可以为动态资源)
 *
 *
 * Servlet开发步骤:
 * 1.使用注解:@WebServlet("/服务路径")
 * 2.继承HttpServlet
 * 3.重写doXXX方法:表示提供XXX的服务方法
 *
 * 注意事项:
 *  1,服务路径必须是"/"开头
 *  2,多个Servlet服务路径不能重复
 *
 *
 * 重写的方法:都包含两个对象:request.response
 * 一般是通过request获取http请求的部分信息
 *      现在虽然有response对象,但是还没有返回响应http数据
 *      自己的程序:设置response对象的内容
 *      tomcat:通过程序方法返回,通过response对象组装http响应;
 *
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //所有servlet代码,都有的比较固定的处理
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //响应的数据格式
        resp.setContentType("text/html");

        //模拟响应一个动态的网页,可以从其他地方获取(如数据库);
        String name = "张三";

        //通过response对象会去输出流,输出字符串为body的内容
        PrintWriter pw = resp.getWriter();
        pw.println("<h2>欢迎你,"+ name + "<h2>");

    }
}
