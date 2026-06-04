package com.smu8.s09_spring_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//1.spring data jpa 컨테이너에서 관리되는 bean 객체
//2.해당 추상클래스를 jpa가 class로 구현
public interface DeptRepository extends JpaRepository<DeptEntity,Integer> {
    List<DeptEntity> findAll();
    List<DeptEntity> findByDname(String dname);
    //find==select by==where SELECT * FROM DEPT WHERE DNAME=?
}
