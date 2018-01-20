package sendredirect;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/redirect")
public class SendRedirectDemo extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name=request.getParameter("name");
        if(name.equals("maitri"))
        {
            response.sendRedirect("login.html");
        }
        else
            response.sendRedirect("error.html");
    }

    }
