<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>부서 리스트</title>
</head>
<body>
<h1>부서 리스트 Model1</h1>

<%
    //doGet(req,res) throw Exception
    Class.forName("oracle.jdbc.OracleDriver");
    String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String user="scott";
    String pw="tiger";
    String sql="SELECT * FROM DEPT";
    try(Connection con= DriverManager.getConnection(url,user,pw);
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery(sql);
    ){
        while (rs.next()){
            //out.print(rs.getInt("deptno"));
            //http://localhost:8888/model1/deptDetail.do?id=30
       %>
        <p>
            <a href="./deptDetail.do?id=<%=rs.getInt("deptno")%>">
                부서번호 : <%=rs.getInt("deptno")%>
                부서이름 : <%=rs.getString("dname")%>
            </a>
        </p>
        <%
        }
    }catch (SQLException e){
        out.print(e.getMessage());
    }
%>
</body>
</html>
