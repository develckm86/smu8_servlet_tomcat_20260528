<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp 만들어보기</title>
</head>
<body>
<%-- jsp 주석  --%>
<%! //전역 class A{ } %>
<% //자바주석
  /*여러줄 주석
  **/
  //doGet(request) 함수 내부 class A{ void doGet(){}}
  // GET : 클라이언트(브라우저)가 url로 리소스 요청
  // POST : 클라이너트가 양식을 제출
  // 쿼리스트링(파라미터) url?a=10&b=20
  String a=request.getParameter("a");
  String b=request.getParameter("b");
 %>
<!-- html 주석 -->
  <h1>jsp 만들어보기 </h1>
  <p>a+b= <%=a+b%></p>
</body>
</html>
