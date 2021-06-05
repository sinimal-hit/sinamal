package org.example.servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.JSONResponse;
import org.example.model.User;
import org.example.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/articleAdd")
public class ArticleAndServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        JSONResponse jsonResponse = new JSONResponse();
        try {
            //1.解析请求数据
            Article article = JSONUtil.deserialize(req.getInputStream(),Article.class);
            HttpSession session = req.getSession(false);
            User user = (User) session.getAttribute("user");
            //2.业务处理
            int count = ArticleDAO.insert(article,user.getId());



            jsonResponse.setSuccess(true);
            //处理成功,可以设置业务数据(业务数据:一般是数据库查询操作出来的)
        }catch (Exception e){
            e.printStackTrace();
            jsonResponse.setCode("ERROR");
            jsonResponse.setMessage("后端程序出错了,请联系管理员");
        }
        String string = JSONUtil.serialize(jsonResponse);
        resp.getWriter().println(string);
    }
}
