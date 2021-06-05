package org.example.filter;

import org.example.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    /**
     * 最后一个参数:过滤器莲
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        //获取请求的路径(匹配服务路路径);
        String uri = req.getServletPath();
        //进行控制资源筛选,也就是必须登录后才能访问的页面;  有前端界面个后端界面两个状态
        if(!uri.startsWith("/static") && !uri.startsWith("/login.html") && !uri.equals("/login2.html")
        && !uri.equals("/login2") && !uri.equals("/login")){
            HttpSession session = req.getSession(false);
            if(session != null){
                User user = (User)session.getAttribute("user");
                if(user != null){
                    chain.doFilter(request,response);
                    return;
                }
            }
            //进行控制,
            String schema = req.getScheme();//获取请求路径中http
            String host = req.getServerName();//ip 或者域名
            int post = req.getServerPort();//端口
            String contextPath = req.getContextPath();//应用上下文路径
            String basePath = schema + "://" + host + ":" + post + contextPath;
            resp.sendRedirect(basePath + "/login/html");

        }else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
