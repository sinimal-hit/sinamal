package com.doer.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/servletLogin")
public class FilterLogin implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        String username = req.getParameter("username");
        if(username.equals("admin")){//登陆成功
            req.getSession().setAttribute("USER_SESSION",req.getSession().getId());
            resp.sendRedirect("./success.jsp");
        }else {
            resp.sendRedirect("./error.jsp");
        }

        chain.doFilter(req,resp);
    }

    @Override
    public void destroy() {

    }
}
