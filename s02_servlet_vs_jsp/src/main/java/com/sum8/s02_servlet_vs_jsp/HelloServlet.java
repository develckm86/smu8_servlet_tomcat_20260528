package com.sum8.s02_servlet_vs_jsp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//http://localhost:8888/servlet_vs_jsp/hello-servlet
//@ 어노테이션 컴파일할때 검사 or 자동완성
//@WebServlet web.xml DD(배포서술자,배포설정)에 동적리소스의 주소등록
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}