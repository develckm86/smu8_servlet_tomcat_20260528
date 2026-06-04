package com.smu8.s08_spring_start;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//@Controller
//1.동적리소스야
//2.어노테이션으로 자동완성
//3.Componen : spring 컨테이너에서 관리되는 객체(Bean)
@Controller
public class HelloController {
    @GetMapping("/hello.do")
    //@ResponseBody //html 을 타임리프로 렌더링하지 않는방식 (문자열,json,xml)
    public void hello(Model model){ //void : 주소와 똑같은 view가 있다.
        //model.addAttribute : view 에 객체 전달
        model.addAttribute("a",111);
        model.addAttribute("b",222);
        //return "hello";//html을 응답
    }
    @GetMapping("/user.do")
    public String user(
            HttpServletRequest req,
            @RequestParam(name = "age") int age,
            //파라미터가 없거나 수로 형변환되지 않으면 400(요청오류)
            @RequestParam(name = "name") String name,
            @RequestParam(defaultValue = "1") int page
            //기본값은 없을수도 있는 파라미터 정의
    ){
        String ageStr=req.getParameter("age");
        System.out.println(age);
        System.out.println(name);
        System.out.println(ageStr);
        return "user";
    }

    @GetMapping("/userObj.do")
    @ResponseBody
    //userObj(...) : 함수의 매개변수는 스프링부터가 객체를 주입,파싱
    public UserDto userObj( //Jackson : 자바객체를 json를 변환(직렬화)
            @ModelAttribute UserDto user
    ){
        return user;
    }

}
