package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try{
            String userName = request.getParameter("userName");
            String password = request.getParameter(("password"));
            String repassword = request.getParameter("repassword");
            String email = request.getParameter("email");
            if (userName.equals("") || password.equals("") || repassword.equals("")
                    || email.equals("")){
                out.println("Error, vui long dien vao");
                request.getRequestDispatcher("WEB-INF/jsp/register.jsp").include(request,response);
            }else if(!password.equals(repassword)){
                out.println("Error, pass k giong nhau");
                request.getRequestDispatcher("WEB-INF/jsp/register.jsp").include(request,response);
            }else{
                out.println("thanh cong");
                request.getRequestDispatcher("WEB-INF/jsp/login.jsp").forward(request,response);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/jsp/register.jsp").include(request,response);
    }
}
