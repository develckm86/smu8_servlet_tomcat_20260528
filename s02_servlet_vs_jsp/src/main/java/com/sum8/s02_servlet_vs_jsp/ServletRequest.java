package com.sum8.s02_servlet_vs_jsp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//http://localhost:8888/servlet_vs_jsp/servlet_request.do
@WebServlet("/servlet_request.do")
public class ServletRequest extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse resp) throws ServletException, IOException {
        String aStr=request.getParameter("a");
        String bStr=request.getParameter("b");
        String cStr=request.getParameter("c");
        int a=0,b=0,c=0;
        try {
            a=Integer.parseInt(aStr);
            b=Integer.parseInt(bStr);
            c=Integer.parseInt(cStr);
        }catch(Exception e) {}

        String html="<html>";
        html+="<head><meta charset='UTF-8'></head>";
        html+="<h1>안녕~ 서블릿 요청 처리야~</h1>";
        html+="<p>a+b+c="+(a+b+c)+"</p>";
        html+="</html>";
        //브라우저가 요청한 리소스를 응답(response)
        resp.getWriter().write(html);
    }
}
