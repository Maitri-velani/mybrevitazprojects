package contextdemo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ContextDemo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter printWriter = resp.getWriter();

        ServletContext servletContext = getServletContext();
        String context=servletContext.getInitParameter("context");

        printWriter.println("Servlet context name is: " +context);
        System.out.println("Servlet context is "+context);
    }
}
