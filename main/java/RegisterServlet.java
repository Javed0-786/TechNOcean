package main.java;
// package com.silan;

import javax.servlet.*;
import javax.servlet.http.*;
import java.IOException.*;

import java.sql.*;
import java.io.*;

public class RegisterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResoponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String s1 = request.getParameter("name");
        String s2 = request.getParameter("email");
        String s3 = request.getParameter("pass");

    }

}
