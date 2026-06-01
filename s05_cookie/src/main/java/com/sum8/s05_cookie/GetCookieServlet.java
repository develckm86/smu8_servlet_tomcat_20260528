package com.sum8.s05_cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getCookies.do")
public class GetCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies(); //쿠키가 없으면 null
        System.out.println(cookies);
        String a=null;
        String b=null;
        if(cookies!=null){
            for(Cookie c: cookies){
                if(c.getName().equals("a")){
                    a=c.getValue();
                }else if(c.getName().equals("b")){
                    b=c.getValue();
                }
            }
        }
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out=resp.getWriter();
        out.println("<h1>찾은 쿠키 a b</h1>");
        out.println("<p>cookie a의 값 : "+a+"</p>");
        out.println("<p>cookie b의 값 : "+b+"</p>");
    }
}
