<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% //doGet(request,response) 메소드 내부
    int a=10;
    double b=10.5;//8
    float c=11.25F;//4바이트
%>
<h1>안녕 서블릿 jsp~!  </h1>
<p><a href="./servlet_request.do">서블릿 요청처리</a></p>
<p><a href="./servlet_request.do?a=10&b=20&c=30">a=10&b=20&c=30 서블릿 요청처리</a></p>

<hr>
<p>a+b+c= <%=a+b+c%></p>
<ul>
    <li>jsp는 자바문법을 작성할 수 있는 동적리소스 </li>
    <li>베이스는 html이고 java를 추가로 작성< % % > </li>
    <li>jsp 인터프리터언어라 문자열을 그대로 컴파일 하면서 실행하면서</li>
    <li>html 을 동적으로 렌더링해서 출력하는 엔진 템플릿엔진(Jasper)</li>
</ul>
<hr>
<%--http://localhost:8888/servlet_vs_jsp/hello_jsp.jsp?a=10&b=20&id=%EA%B2%BD%EB%AF%BC--%>
<p><a href="./hello_jsp.jsp?a=10&b=20&id=경민">?a=10&b=20로 jsp 호출~</a></p>
<p><a href="./hello_jsp.jsp">jsp 호출~</a></p>
<p><a href="./hello_jsp.jsp?a=10&b=20">?a=10&b=20로 jsp 호출~</a></p>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>