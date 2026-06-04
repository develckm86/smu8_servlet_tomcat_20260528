package com.smu8.s09_spring_jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter @Setter
@Entity
@Table(name="dept")
public class DeptEntity {
    //Entity : 1.테이블데이터 맵핑,2.데이터저장(bean dto)
    @Id
    @Column(name = "deptno")
    private int id;
    private String dname;
    private String loc;

}
