package hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloWorld extends HttpServlet {
    public void doGet(HttpServletRequest rq, HttpServletResponse rs) throws ServletException,IOException
    {
        PrintWriter pw = rs.getWriter();
        rs.setContentType("text/html");

        pw.println("Hello World.");
        }
}
