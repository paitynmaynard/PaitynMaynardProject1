package com.ex.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ProductsServlet Created By:Paityn Maynard on April 30,2020
 */
public class ProductsServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servicing MyServlet");
        super.service(req, resp);
    }

    public void destroy() {
        System.out.println("Destroy MyServlet");
        super.destroy();
    }

    public void init() throws ServletException {
        System.out.println("Init MyServlet");
        super.init();
    }

//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String name = req.getParameter("myname");
//
//        if(name != null) {
//            resp.getWriter().write("Hello, " + name);
//        } else {
//            resp.getWriter().write("Hello, World!");
//        }
//        resp.setStatus(201);
//        resp.setContentType("text/plain");
//    }

//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        if(username != null) {
//            resp.getWriter().write("Hello, " + username);
//            String password = req.getParameter("password");
//        } else {
//            resp.getWriter().write("Hello, World!");
//        }
//
//        resp.setStatus(201);
//        resp.setContentType("text/plain");
//    }
//}

}
