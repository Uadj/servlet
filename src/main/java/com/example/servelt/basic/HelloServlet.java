package com.example.servelt.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException{
        System.out.println("hello servlet");
        System.out.println("req" + request);
        System.out.println("res" + response);
        String username = request.getParameter("username");
        System.out.println("username" + username);
    }
}