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
 * 保存用户上一次访问的时间
 */
@WebServlet("/cookie01")
public class CookieTest01  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //服务器告诉你来的时间,把这个时间封装为一个信件,你下次带来,我就知道你来了
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-16");
        PrintWriter out = resp.getWriter();


        //Cookie,服务器端从客户端获取,
        Cookie[] cookies = req.getCookies();//这里返回数组,说明cookie可能存在多个

        //判断cookie是否存在
        if(cookies != null){
            //如果存在怎么斑
            out.write("你上一次访问的时间是: ");

            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                //获取cookie的名字
                if (cookie.getName().equals("lastLoginTime")){
                    //获取cookie中的值
                    long lastLoginTime = Long.parseLong(cookie.getValue());
                    Date date = new Date(lastLoginTime);
                    out.write(date.toLocaleString());
                }
            }
        }else {
            out.print("这是您第一次访问本网站");
        }

        //服务器给客户端响应一个Cookie
        Cookie cookie = new Cookie("lastLoginTime",System.currentTimeMillis()+"");
        cookie.setMaxAge(24*60*60);//设置有效期为一天
        resp.addCookie(cookie);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
