<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Session으로 서버에 로그인 정보 저장!</title>
</head>
<body>
<%  //HttpSession session1=request.getSession();
    Object loginUserIdObj=session.getAttribute("loginUserId");
    Object loginUserNameObj=session.getAttribute("loginUserName");
%>
<p>
    <%if(loginUserIdObj!=null){%>
    <b>(<%=loginUserIdObj%>)<%=loginUserNameObj%> 님 로그인 중</b> /
    <a href="./logout.do">로그아웃</a>
    <%}else{
       out.println("로그인하세요!");
    }%>
</p>
<hr>
<h1>Session으로 서버에 로그인 정보 저장!</h1>
<br/>
<nav>
    <ul>
        <li><a href="./login.do">로그인페이지로</a></li>
    </ul>
</nav>
</body>
</html>