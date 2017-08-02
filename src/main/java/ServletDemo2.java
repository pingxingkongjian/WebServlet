import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ${刘晋勇}
 * on 2017/8/2.
 */
public class ServletDemo2 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过调研GenericServlet类中getServletContext()获取ServletContext对象
      ServletContext application = this.getServletContext();
        //向ServletContext对象中存放数据  name-Tom
      application.setAttribute("name","Tom");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
