package com.sum8.s05_cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/removeCookies.do")
public class RemoveCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie aCookie=null;
        Cookie bCookie=null;
        if(req.getCookies()!=null){
            Cookie [] cookies=req.getCookies();
            for(Cookie c: cookies){
                switch (c.getName()){
                    case "a":
                        aCookie=c;
                        aCookie.setMaxAge(0);
                        aCookie.setPath("/");
                        resp.addCookie(aCookie);
                    break;
                    case "b":
                        bCookie=c;
                        bCookie.setMaxAge(0);
                        resp.addCookie(bCookie);
                    break;
                }
            }
        }

        resp.sendRedirect("./");
    }
}
