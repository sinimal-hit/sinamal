package com.doer.filter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 这个类处理完请求之后,响应给前端肯定会出现乱码情况
 *解决方法:
 *      ①设置编码格式为utf-8
 *      ②:添加过滤器
 */
@WebServlet("/show")
public class ShowCharacterEncodingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("你好世界");
    }
}
