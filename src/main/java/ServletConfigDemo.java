import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ${刘晋勇}
 * on 2017/8/2.
 */
public class ServletConfigDemo extends HttpServlet {
    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        this.config = config;
    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String value1 = config.getInitParameter("encoding");
        //通过初始化参数的  名称 获取对应的value值
        System.out.println("第一种获取ServletConfig的方式："+ value1);

        //第二种获取ServletConfig的方式
       String value2 = this.getServletConfig().getInitParameter("encoding");
       System.out.println("第二种获取ServletConfig的方式：" + value2);

        //第三种获取ServletConfig的方式
        String value3 = super.getInitParameter("encoding");
        System.out.println("第三种获取ServletConfig的方式：" + value3);
    }

    @Override
   public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
