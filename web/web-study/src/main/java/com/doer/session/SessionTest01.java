package com.doer.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 创建Session,设置session键值
 */
@WebServlet("/session01")
public class SessionTest01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //解决乱码问题,
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //得到Session
        HttpSession session = req.getSession();

        //给Session中存东西
        session.setAttribute("name","朵儿");

        //获取Session的id
        String id = session.getId();

        //判断是不是新创建的Session
        if(session.isNew()){
            resp.getWriter().write("session创建成功,ID=:"+id);
        }else {
            resp.getWriter().write("session已经在服务器中存在了,ID+:"+id);
        }


    }
}
