<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>쿠키로그인</title>
</head>
<body>
  <h1>쿠키 로그인</h1>
  <p>id/pw = scott/tiger 로 로그인 가능!</p>
  <%
    String userIdVal="";
    if(session.getAttribute("userIdVal")!=null){
      userIdVal=(String) session.getAttribute("userIdVal");
    }
  %>
  <form action="./cookieLogin.do" method="post">
    <p>
      <label>ID :
        <input name="userId" type="text"
               value="<%=userIdVal%>">
      </label>
    </p>
    <p><label>PW : <input name="userPw" type="text"></label></p>
    <p><label> 7일간 로그인 유지
      <input type="checkbox" name="isCookieLogin" value="1"></label>
    </p>
    <p><button type="submit">로그인</button></p>
  </form>


</body>
</html>
