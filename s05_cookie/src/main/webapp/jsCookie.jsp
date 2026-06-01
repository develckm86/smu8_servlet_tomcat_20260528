<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>js 쿠키로 하루동안 보지 않기 배너 생성</title>
</head>
<body>
    <h1>js 쿠키로 하루동안 보지 않기 배너 생성</h1>
    <script>
        //UTString : 2026-06-08T03:37:54.420Z
        //쿠키 생성! "key=value; expires=Mon, 01 Jun 2026 04:05:35 GMT; path=/;/"
        const now = new Date();
        now.setDate(now.getDate() + 1); // 하루뒤
        document.cookie="banner=true; path=/; expires="+now.toUTCString();

        console.log(document.cookie);
        console.log(document.cookie.includes("loginUserId"));
        console.log(document.cookie.split(";"));
        //부모 윈도우를 기준으로 자식윈도우 생성 (팝업 동의)
        //isBanner=true; //(하루동안 유지될 배너 쿠키)
        let isBanner=document.cookie.includes("isBanner=true");
        if(!isBanner){
            window.open("./banner.html","banner","width=400,height=400,left=0,top=0","_blank");
        }

    </script>
</body>
</html>
