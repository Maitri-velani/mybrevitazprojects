package requestdispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletForwardDemo extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String name=request.getParameter("uname");
        String pass=request.getParameter("password");

        if(pass.equals("servlet") && name.equals("maitri"))
        {
            RequestDispatcher rd=request.getRequestDispatcher("servlet2");
            rd.forward(request, response);
            //forward method simply forward request2 to servlet2 and
            // it doesn't display servlet1's response
            //response will send by servlet2 directly
        }
        else
        {
            pw.print("Sorry UserName or Password Error!");
            RequestDispatcher rd = request.getRequestDispatcher("/error.html");
            rd.include(request, response);
        }
    }
}
