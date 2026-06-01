package com.sum8.s05_cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/cookieLogin.do")
public class CookieLoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId=req.getParameter("userId");
        String userPw=req.getParameter("userPw");
        String isCookieLogin=req.getParameter("isCookieLogin");

        String id="scott";
        String pw="tiger";
        String name="경민코딩";
        //세션 로그인
        if(userId.equals(id) && userPw.equals(pw)){
            if(isCookieLogin!=null && isCookieLogin.equals("1")) {
                //7일간 로그인 유지
                Cookie c1=new Cookie("isCookieLogin","1");
                Cookie c2=new Cookie("loginUserId",id);
                Cookie c3=new Cookie("loginUserName",name);
                int age=(60*60*24*7);
                String path="/";
                c1.setMaxAge(age);
                c2.setMaxAge(age);
                c3.setMaxAge(age);
                c1.setPath(path);
                c2.setPath(path);
                c3.setPath(path);
                resp.addCookie(c1);
                resp.addCookie(c2);
                resp.addCookie(c3);
            }
            HttpSession session=req.getSession();
            session.setAttribute("loginId",id);
            session.setAttribute("loginName",name);
            resp.sendRedirect("./");
        }else {
            req.getSession().setAttribute("userIdVal",userId);
            resp.sendRedirect("./cookieLogin.do");
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path="/WEB-INF/views/login.jsp";
        req.getRequestDispatcher(path)
                .forward(req,resp);
    }
}
