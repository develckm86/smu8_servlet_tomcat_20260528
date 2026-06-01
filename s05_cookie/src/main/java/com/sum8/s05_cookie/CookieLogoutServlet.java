package com.sum8.s05_cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/cookieLogout.do")
public class CookieLogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //세션 로그아웃
        HttpSession session=req.getSession();
        session.invalidate();
        //쿠키 로그아웃
        if(req.getCookies()!=null){
            for(Cookie c: req.getCookies()){
                switch (c.getName()){
                    case "isCookieLogin":
                    case "loginId":
                    case "loginName":
                        c.setMaxAge(0);
                        c.setPath("/");
                        resp.addCookie(c);
                        break;
                }
            }
        }
        resp.sendRedirect("./");

    }
}
