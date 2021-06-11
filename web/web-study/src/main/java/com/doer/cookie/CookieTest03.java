package com.doer.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * cookie传递中文数据
 */
@WebServlet("/cookie03")
public class CookieTest03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cookies = req.getCookies();
        resp.setCharacterEncoding("utf-16");
        PrintWriter out = resp.getWriter();
        if(cookies != null){

            //如果存在怎么斑
            out.write("你上一次访问的时间是: ");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的名字
                if (cookie.getName().equals("name")){
                    //获取cookie中的值
                    out.write(cookie.getValue());
                }
            }
        }else {
            out.print("这是您第一次访问本网站");
        }

        Cookie cookie = new Cookie("name","朵儿");

        resp.addCookie(cookie);
    }
}
