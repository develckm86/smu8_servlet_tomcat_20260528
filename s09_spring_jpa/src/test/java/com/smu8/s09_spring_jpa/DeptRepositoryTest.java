package com.smu8.s09_spring_jpa;

import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //스프링 컨테이너가 객체 생성
class DeptRepositoryTest {
    @Autowired
    DeptRepository deptRepository;

    @Test
    void findAll() {
        System.out.println(deptRepository.findAll());
    }
    @Test
    void findByDname() {
        System.out.println(deptRepository.findByDname("ACCOUNTING"));
    }
}