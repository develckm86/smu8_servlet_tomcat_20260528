<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>브라우저에 저장하는 데이터 쿠키</title>
</head>
<body>
<h1>브라우저에 저장하는 데이터 쿠키</h1>
<%
    Object loginId=session.getAttribute("loginId");
    Object loginName=session.getAttribute("loginName");
    if(loginId!=null){
%>
    <p>
        (${loginId})${loginName} 님 로그인 /
        <a href="./cookieLogout.do">로그아웃(쿠키를만료해야함)</a>
    </p>
<%}%>
<nav>
    <ul>
        <li><a href="./addCookies.do">쿠키저장 요청~(a=10,b=20)</a></li>
        <li><a href="./getCookies.do">저장된 쿠키 찾기~(a, b)</a></li>
        <li><a href="./removeCookies.do">쿠키삭제 요청~(a, b)</a></li>
        <li><a href="./cookieLogin.do">쿠키 로그인</a></li>
        <li><a href="./jsCookie.jsp">하루동안보지않기 배너(js로 쿠키 저장 불러오기)</a></li>
        <li><a href="./localStorageTest.jsp">로컬저장소에 데이터 저장 조회 삭제</a></li>
    </ul>
</nav>
<br/>
</body>
</html>