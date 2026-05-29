package com.sum8.s03_forward_vs_redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String userId=req.getParameter("userId");
        String userPw=req.getParameter("userPw");
        System.out.println(userId);
        System.out.println(userPw);
        resp.getWriter().write("login action page");
        //일반적으로 action 페이지 는 db에 접속해서
        //DML(Insert,Update,Delete)을 실행합니다.
        if(userId.equals("경민코딩")&&userPw.equals("1234")){
            resp.sendRedirect("./success.jsp");
        }else {
            resp.sendRedirect("./index.jsp");
        }
    }
}
