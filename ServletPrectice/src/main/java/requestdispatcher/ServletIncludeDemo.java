package requestdispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletIncludeDemo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name=request.getParameter("uname");
        String pass=request.getParameter("password");

        if(pass.equals("servlet") && name.equals("maitri"))
        {
            pw.print("See this is response");

            RequestDispatcher rd=request.getRequestDispatcher("servlet2");
            rd.include(request, response);
        }
        else
        {
                pw.print("Sorry UserName or Password Error!");
                RequestDispatcher rd = request.getRequestDispatcher("/error.html");
                rd.include(request, response);
                //include methode add answer of servlet1 and servlet2.
        }
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        String name=request.getParameter("name");
        response.sendRedirect("includeDemo.html");
    }
}
