package com.doer.response;
/**
 * Response
 * 下载文件功能的实现
 */

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/http01")
public class HttpResponseTest01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.要下载的文件路径
        String realPath =  this.getServletContext().getRealPath("./img/1.png");
        System.out.println("获取到要下载的文件路径:  "+realPath);
        //2.下载的文件名是啥
        String fileName =  realPath.substring(realPath.lastIndexOf("//") + 1);
        //3.设置想办法让浏览器能够支持(Content-Disposition)下载我们需要的东西
        resp.setHeader("Content-Disposition","attachment;filename=" + fileName);
        //4.获取下载文件的输入流
        FileInputStream inputStream = new FileInputStream(realPath);

        //5.创建缓冲区
        int len = 0;
        byte[] buffer = new byte[1024];

        //6.获取OutputStream对象
        ServletOutputStream outputStream = resp.getOutputStream();
        //7.将FileOutputStream写入到buffer缓冲区中,使用OutputStream将缓冲区中的数据输出到客户端
        while((len = inputStream.read(buffer)) > 0){
            outputStream.write(buffer,0,len);
        }
        inputStream.close();
        outputStream.close();
    }
}
