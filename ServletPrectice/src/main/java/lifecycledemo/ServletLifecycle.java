package lifecycledemo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/lifeCycle")
public class ServletLifecycle extends HttpServlet {
    @Override
    public void init()
    {
        System.out.println("Servlet life cycle: init() called");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
    {
        PrintWriter printWriter=response.getWriter();
        printWriter.println("This is servlet life cycle");
    }

    @Override
    public void destroy()
    {
        System.out.println("Servlet life cycle: destroy() called");
    }
}
