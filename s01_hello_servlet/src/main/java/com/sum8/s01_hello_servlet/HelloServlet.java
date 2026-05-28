package com.sum8.s01_hello_servlet;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


//http://localhost:8888/s01_hello_servlet_war_exploded/hello-servlet
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "안녕서블릿!!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><head><meta charset='UTF-8'></head><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}