<%@ page import="java.util.List" %>
<%@ page import="com.smu8.dto.DeptDto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Object deptsObj=request.getAttribute("depts");
  List<DeptDto> depts=(List<DeptDto>) deptsObj;
%>
  <h1>부서 리스트</h1>
  <ul>
    <%for(DeptDto d: depts){%>
    <li> 부서 번호 : <%=d.getDeptno()%></li>
    <li> 부서 이름 : <%=d.getDename()%></li>
    <li> 부서 위치 : <%=d.getLoc()%></li>
    <%}%>
  </ul>
</body>
</html>
