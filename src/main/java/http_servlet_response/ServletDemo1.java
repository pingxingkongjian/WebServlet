package http_servlet_response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by ${刘晋勇}
 * on 2017/8/2.
 */
public class ServletDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //告诉服务器使用什么编码解析文本
//        resp.setCharacterEncoding("utf-8");

        //告诉客户端使用什么编码解析文本
//        resp.setHeader("content-type","text/html;charset = utf-8");

        //告诉服务器使用什么编码解析文本，再告诉客户端使用什么编码解析相应文本
        resp.setContentType("Text/html;charset = UTF-8");
        //得到一个字符输出流

        PrintWriter out = resp.getWriter();
        //向客户端响应文本内容
        out.write("你好！");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
