package api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import compile.Answer;
import compile.Question;
import compile.Task;
import problem.Problem;
import problem.ProblemDAO;
import util.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/compile")
public class CompileServlet extends HttpServlet {
    Gson gson = new GsonBuilder().create();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //读取数据
        String body = HttpUtil.readBody(req);
        //读取的json数据转为对象
        CompileRequest compileRequest = gson.fromJson(body,CompileRequest.class);
        //根据前端请求发送的id信息,后端数据库查找该题对应的测试用力,合并成完成的代码模块
        ProblemDAO problemDAO = new ProblemDAO();
        Problem problem = problemDAO.selectOne(compileRequest.getId());
        String testCode = problem.getTestCode();
        String requestCode = compileRequest.getCode();
        String finalCode = mergeCode(requestCode,testCode);

        //合并完成之后,编译运行,task.compileAndRun()方法需要传入Question对象,也就是代码
        Question question = new Question();
        question.setCode(finalCode);
        Task task = new Task();
        Answer answer = null;
        try {
            answer = task.compileAndRun(question);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        CompileResponse compileResponse = new CompileResponse();
        compileResponse.setError(answer.getErrno());
        compileResponse.setReason(answer.getReason());
        compileResponse.setStdout(answer.getStdout());

        //将返回信息封装为json格式返回
        String respString = gson.toJson(compileResponse);
        resp.setStatus(200);
        resp.setContentType("application/json; charset=utf-8");
        resp.getWriter().write(respString);

    }

   //把用户提交的代码与测试代码合并
    private String mergeCode(String requestCode, String testCode) {
        int pos = requestCode.lastIndexOf("}");
        if(pos == -1){
            return null;
        }
        return requestCode.substring(0,pos) + testCode + "\n}";
    }
}
