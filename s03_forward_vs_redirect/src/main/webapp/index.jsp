<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>포워드 vs 라다이렉트</title>
</head>
<body>
<h1>포워드 vs 라다이렉트</h1>
<br/>
<a href="./forward.do">포워드</a>
<hr>
<h2>로그인 양식 제출 (post)</h2>

<%--userId=%EA%B2%BD%EB%AF%BC%EC%BD%94%EB%94%A9&userPw=1234--%>
<form action="./login.do" method="post">
    <p><label>아이디 : <input name="userId" value="경민코딩"></label></p>
    <p><label>비밀번호 : <input name="userPw" value="1234"></label></p>
    <p>
        <button>로그인</button>
    </p>
</form>
</body>
</html>