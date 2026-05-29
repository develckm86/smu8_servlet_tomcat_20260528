package com.sum8.s04_session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logout.do")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        //1.세션의 객체 지우기
        //session.removeAttribute("loginUserId");
        //session.removeAttribute("loginUserName");
        //2.해당 브라우저 요청과 대응되는 모든 세션 만료
        session.invalidate();
        resp.sendRedirect("./");
    }
}
