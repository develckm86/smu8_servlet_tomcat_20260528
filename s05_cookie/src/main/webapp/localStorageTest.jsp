<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="true" %>
<html>
<head>
    <title>로컬 저장소</title>
</head>
<body>
    <h1>로컬 저장소</h1>
    p>button#loadUserBtn{user 불러오기}
    <p>
        <button id="loadUserBtn">user 불러오기</button>
    </p>
    <div id="userCont"></div>
    <script>
        localStorage.setItem("name","경민코딩");
        localStorage.setItem("user",'{"name":"경민코딩","age":40}');
        loadUserBtn.onclick=function (){
            let user=localStorage.getItem("user");
            user=JSON.parse(user);
            console.log(user,user.name,user.age);
            userCont.innerHTML=`이름 :${user.name}`;
        }
    </script>
</body>
</html>
