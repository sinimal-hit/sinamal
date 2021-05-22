package api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import problem.Problem;
import problem.ProblemDAO;
import util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

@WebServlet("/problem")
public class  ProgramServlet  extends HttpServlet {
    private Gson gson = new GsonBuilder().create();

    /**
     * doGet方法 用来实现读取题目列表和读取指定题目详情
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.setStatus(200);
        String id = req.getParameter("id");
        if(id == null || id.equals("")){
            selectAll(resp);
        }else {
            selectOne(Integer.parseInt(id),resp);
        }
    }

    private void selectOne(int id ,HttpServletResponse resp) throws IOException {
        ProblemDAO problemDAO = new ProblemDAO();
        Problem problem = problemDAO.selectOne(id);
        String respString = gson.toJson(problem);
        resp.getWriter().write(respString);

    }

    private void selectAll(HttpServletResponse resp) throws IOException {
        ProblemDAO problemDAO = new ProblemDAO();
        List<Problem> problems =  problemDAO.selectAll();
        String respString = gson.toJson(problems);
        resp.getWriter().write(respString);
    }

    /**
     * doPost新增一个题目的数据
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setStatus(200);
        resp.setCharacterEncoding("UTF-8");
        String body = HttpUtil.readBody(req);

        //将读到的body数据转为json格式
        Problem problem = gson.fromJson(body,Problem.class);
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.insert(problem);

        resp.getWriter().write("{\"ok\": 1}");

    }

    /**
     *  删除操作
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF_8");
        resp.setStatus(200);
        resp.setContentType("application/json");
        String id = req.getParameter("id");
        if(id == null || id.equals("")){
            resp.getWriter().write("\"{\\\"ok\\\": 0, \\\"reason\\\": \\\"id 不存在\\\"}\"");
            return;
        }
        ProblemDAO problemDAO = new ProblemDAO();
        problemDAO.delete(Integer.parseInt(id));
        resp.getWriter().write("{\"ok\": 1}");

    }

    private String readBody(HttpServletRequest req) throws UnsupportedEncodingException {
        int contentLength = req.getContentLength();
        byte[] bytes = new byte[contentLength];
        try {
            InputStream inputStream = req.getInputStream();
            inputStream.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(bytes,"utf-8");
    }
}
