package com.smu8.s09_spring_jpa;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

// /emp/**
@RequestMapping("/emp")
@Controller
@AllArgsConstructor
public class EmpController {
    //EmpEntity , EmpRepository
    //@Autowired
    //private DeptRepository deptRepository;

    private final DeptRepository deptRepository;
    //public EmpController(DeptRepository deptRepository) {this.deptRepository = deptRepository;}

    @GetMapping("/")
    public String list(Model model){
        List<DeptEntity> depts=deptRepository.findAll();
        model.addAttribute("depts",depts);
        return "emp/list";
    }

}
