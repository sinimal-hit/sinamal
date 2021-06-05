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

@WebServlet("/articleDelete")
public class ArticleDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        JSONResponse jsonResponse = new JSONResponse();
        try{
            //1解析请求数据
            String ids = req.getParameter("ids");

            //2业务处理 根多个id删除文章
            int count = ArticleDAO.delete(ids.split(","));
            jsonResponse.setSuccess(true);
            //设置业务数据
        }catch (Exception e){
            e.printStackTrace();
            jsonResponse.setCode("ERROR");
            jsonResponse.setMessage("文章内容删除出错");
        }
        String string = JSONUtil.serialize(jsonResponse);
        resp.getWriter().println(string);


    }
}
