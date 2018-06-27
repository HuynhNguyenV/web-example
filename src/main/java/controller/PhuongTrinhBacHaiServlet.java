package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PhuongTrinhBacHaiServlet", urlPatterns = "/phuongtrinhbachai")
public class PhuongTrinhBacHaiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        double a = Double.parseDouble(request.getParameter("txtA"));
        double b = Double.parseDouble(request.getParameter("txtB"));
        double c = Double.parseDouble(request.getParameter("txtC"));
        double delta = b * b - 4 * a * c;
        try{
                if (delta < 0) {
                    session.setAttribute("message", "Phuong Trinh Vo Nghiem");
                } else if (delta == 0) {
                    double result = -b / (2 * a);
                    session.setAttribute("message", "Phuong Trinh nghiem kep: " + result);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    session.setAttribute("message", "Phuong Trinh Co 2 nghiem: x1 = "
                            + x1 + "; x2 = " + x2);
                }
                getServletContext().getRequestDispatcher("/WEB-INF/jsp/PhuongTrinhBacHai.jsp")
                        .include(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/PhuongTrinhBacHai.jsp").forward(request,response);
    }
}
