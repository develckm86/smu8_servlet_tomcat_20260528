package com.sum8.s05_cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebFilter("/*") //모든 요청 전에 실행
public class LoginFilter implements Filter {
    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        System.out.println("로그인 필터입니다!!");
        HttpServletRequest req=(HttpServletRequest)request;
        HttpServletResponse res=(HttpServletResponse)response;
        HttpSession session=req.getSession();
        //이미 로그인이 된 유저는 자동로그인 하지 않음
        Cookie [] cookies=req.getCookies();
        if (session.getAttribute("loginId")!=null ||
            cookies==null ){
            chain.doFilter(request,response);
            return;
        }
        Cookie isLoginCookie=null;
        Cookie loginUserId=null;
        Cookie loginUserName=null;
        for(Cookie c: cookies){
            switch (c.getName()){
                case "isCookieLogin": isLoginCookie=c; break;
                case "loginUserId": loginUserId=c; break;
                case "loginUserName": loginUserName=c; break;
            }
        }
        if(isLoginCookie!=null && loginUserId!=null && loginUserName!=null){
            session.setAttribute("loginId",loginUserId.getValue());
            session.setAttribute("loginName",loginUserName.getValue());
            System.out.println("자동 로그인 성공!");
        }
        chain.doFilter(request,response);
    }
}
