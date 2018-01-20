package getparameter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class GetParameterDemo extends HttpServlet{
    public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException,IOException
    {
        String name=rq.getParameter("name");
        PrintWriter pw = rs.getWriter();
        pw.print("Hello "+ name);
    }
}
