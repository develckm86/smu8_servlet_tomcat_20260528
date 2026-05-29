package com.sum8.s03_forward_vs_redirect;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//ForwardServlet
@WebServlet("/forward.do") // .forward.do ./forward 의 상대경로 작성시 오류
public class ForwardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//템플릿을 사용하는 이유: 동적리소스에서 문자열로 html을 출력하면 재사용이 어려워서
//        String html= """
//                <h1> 안녕 forward.do 야~
//                """;
//        resp.setContentType("text/html;charset=UTF-8");
//        resp.getWriter().write(html);
        //포워드는 응답을 마치지 않고 다른 jsp에게 나머지 요청응답처리를 위임
        String[]fruits={"사과","바나나","딸기","수박","참외","망고스틱"};
        req.setAttribute("fruits", fruits);
        req.getRequestDispatcher("/forward_test.jsp")
                .forward(req, resp);
    }
}
