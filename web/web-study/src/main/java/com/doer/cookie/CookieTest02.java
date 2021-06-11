package com.doer.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/cookie02")
public class CookieTest02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建Cookie,
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");

        //将cookie有效期设置为0
        cookie.setMaxAge(0);

        resp.addCookie(cookie);
    }
}
