package com.sum8.s05_cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/addCookies.do")
public class AddCookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie1 =new Cookie("a","10");
        Cookie cookie2 =new Cookie("b","20");
        cookie1.setMaxAge(60*5); //5분
        cookie2.setMaxAge(60*5); //5분
        cookie1.setPath("/"); //서버의 모든 (root)경로 : 모든경로에서 쿠키적용
        resp.addCookie(cookie1);
        resp.addCookie(cookie2);
        resp.sendRedirect("./");
    }
}
