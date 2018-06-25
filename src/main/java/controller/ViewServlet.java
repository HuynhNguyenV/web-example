package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewServlet", urlPatterns = {"/view/*"},
        initParams = @WebInitParam(name = "FirstName", value = "Huynh"), loadOnStartup = 1)
public class ViewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = getServletConfig().getInitParameter("FirstName");
        PrintWriter writer = response.getWriter();
        writer.println("Name: " + name);
    }
}
