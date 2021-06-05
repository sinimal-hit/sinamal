package org.example.servlet;

import org.example.dao.ArticleDAO;
import org.example.model.Article;
import org.example.model.JSONResponse;
import org.example.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");

        JSONResponse jsonResponse = new JSONResponse();
        try{
            //1解析请求数据
            Article article =JSONUtil.deserialize(req.getInputStream(),Article.class);
            //2业务处理 根据文章id修改文章的标题和内容
            int count = ArticleDAO.update(article);
            jsonResponse.setSuccess(true);
            //设置业务数据
        }catch (Exception e){
            e.printStackTrace();
            jsonResponse.setCode("ERROR");
            jsonResponse.setMessage("文章内容查询出错");
        }
        String string = JSONUtil.serialize(jsonResponse);
        resp.getWriter().println(string);

    }
}
