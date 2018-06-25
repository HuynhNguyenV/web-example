package com.huynh.servlet;

import com.google.common.cache.LoadingCache;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AppServlet", urlPatterns = "/app", loadOnStartup = 1)
public class AppServlet extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("Servlet Loaded " +this);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Object cache = request.getServletContext().getAttribute("GLOBAL_CACHE");
        if (cache instanceof LoadingCache) {
            try {
                response.getWriter().println((((LoadingCache)cache).get("key")));
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
