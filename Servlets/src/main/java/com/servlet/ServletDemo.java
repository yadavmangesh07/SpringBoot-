package com.servlet;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo extends HttpServlet {


    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");
        res.getWriter().println("Mangesh Yadav");

    }
}


