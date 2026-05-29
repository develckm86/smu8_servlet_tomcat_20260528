package com.sum8.s04_session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/login_form.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //로그인 성공시 ->index
        //로그인 실패시 ->login.do
        //smu8/1234 유저가 존재
        req.setCharacterEncoding("UTF-8");
        String id=req.getParameter("id");
        String pw=req.getParameter("pw");
        if(id.equals("smu8") && pw.equals("1234")){
            HttpSession session=req.getSession();
            session.setAttribute("loginUserId","smu8");
            session.setAttribute("loginUserName","경민코딩");
            resp.sendRedirect("./index.jsp");
        }else{
            resp.sendRedirect("./login.do");
        }

    }
}
