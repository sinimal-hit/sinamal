package com.doer.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("CharacterEncodingFilter初始化");
    }

    /**
     * 1.过滤器中的所有代码,在过滤特定请求的时候都会执行
     * 2.必须要让过滤器继续执行
     *      chain.doFilter(request,response);
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");


        System.out.println("CharacterEncodingFilter执行前...........");

        chain.doFilter(request,response);//让我们的程序继续走,如果不写,程序到这里就会停止不走

        System.out.println("CharacterEncodingFilter执行后...........");

    }

    @Override
    public void destroy() {
        System.out.println("CharacterEncodingFilter销毁");
    }
}
