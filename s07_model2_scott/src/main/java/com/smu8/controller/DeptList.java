package com.smu8.controller;

import com.smu8.dto.DeptDto;
import com.smu8.service.DeptService;
import com.smu8.service.DeptServiceImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/deptList.do")
public class DeptList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String page=req.getParameter("page");
        //파라미터처리
        DeptService deptService=new DeptServiceImp();
        try {
            List<DeptDto> depts=deptService.getAll();
            req.setAttribute("depts",depts);
            req.getRequestDispatcher("/WEB-INF/views/deptList.jsp")
                    .forward(req,resp);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
