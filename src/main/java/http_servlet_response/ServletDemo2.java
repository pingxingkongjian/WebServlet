package http_servlet_response;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ${刘晋勇}
 * on 2017/8/2.
 */
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //告诉浏览器以什么格式的编码解析
        resp.setContentType("text/html;charset =utf-8");

        //获取字节输出流
        ServletOutputStream out = resp.getOutputStream();

        //getBytes()默认编码为本地（操作系统）编码
        out.write("你好123".getBytes("utf-8"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
