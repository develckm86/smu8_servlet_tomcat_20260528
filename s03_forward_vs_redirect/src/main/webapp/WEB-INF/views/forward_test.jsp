<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forward_test</title>
</head>
<%--/forward_vs_redirect/forward_test.jsp
  /forward_vs_redirect/WEB-INF/views/forward_test.jsp
--%>
<%
  Object fruitsObj=request.getAttribute("fruits");
  String[] fruits=(String[]) fruitsObj;
%>
<body>
  <h1>서블릿에세 포워드된 페이지~</h1>
  <ul>
    <%for(String f : fruits){%>
      <li><%=f%></li>
    <%}%>
  </ul>

  <hr>
  <ul>
    <li>01과일</li>
    <li>02과일</li>
    <li>03과일</li>
    <li>04과일</li>
    <li>05과일</li>
  </ul>
</body>
</html>
