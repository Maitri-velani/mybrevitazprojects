package lifecyclewithCC;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CCL")
public class LifeCycleWithConfigAndContext extends HttpServlet {

    @Override
    public void init()
    {
        System.out.println("Servlet life cycle: init() called");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("This is servlet config demo.......");

        ServletConfig config=getServletConfig();
        String contextName = config.getInitParameter("init");
        printWriter.println("Config Name is: "+contextName);
        System.out.println(config.getInitParameter("init"));

        ServletContext context=getServletContext();
        String driverName=context.getInitParameter("context");
        printWriter.println("Context name is="+driverName);
    }

    @Override
    public void destroy()
    {
        System.out.println("Servlet life cycle: destroy() called");
    }
}
