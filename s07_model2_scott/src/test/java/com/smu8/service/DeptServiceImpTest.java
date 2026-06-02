package com.smu8.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeptServiceImpTest {

    @Test
    void getAll() throws Exception{
        DeptService deptService=new DeptServiceImp();
        System.out.println(deptService.getAll());
    }
}