package com.sum8.s06_model1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.*;

@WebServlet("/deptDetail.do")
public class DeptDetailServlet extends HttpServlet {
    String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
    String user="scott";
    String pw="tiger";
    String sql="SELECT * FROM DEPT WHERE DEPTNO = ?";
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String deptnoStr=req.getParameter("id");
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try(Connection con= DriverManager.getConnection(url,user,pw);
            PreparedStatement pstmt=con.prepareStatement(sql);
        ){
            int deptno=Integer.parseInt(deptnoStr);
            pstmt.setInt(1,deptno);
            try(ResultSet rs=pstmt.executeQuery()){
                resp.setContentType("text/html;charset=utf-8");
                resp.getWriter().println("<h1>부서 상세 Detail</h1>");
                if(rs.next()){
                    String dname=rs.getString("DNAME");
                    String loc=rs.getString("LOC");
                    resp.getWriter().println("<p>부서번호:"+deptno+"</p>");
                    resp.getWriter().println("<p>부서이름:"+dname+"</p>");
                    resp.getWriter().println("<p>부서위치:"+loc+"</p>");
                }
            }
        }catch (NumberFormatException e){
            e.printStackTrace();
            resp.setStatus(400); //요청오류
            return;
        } catch (SQLException e) {
            e.printStackTrace();
            resp.setStatus(500);   //서버오류
        }
    }
}
