package servlet_context;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by ${刘晋勇}
 * on 2017/8/2.
 */
public class ServletContextDemo4 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        text();
    }

    private void text() throws IOException {
        String path = this.getServletContext().getRealPath("/WEB-INF/a.properties");
        System.out.println(path);
        Properties properties  = new Properties();
        properties.load(new FileInputStream(path));
        System.out.println(properties.getProperty("key"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
