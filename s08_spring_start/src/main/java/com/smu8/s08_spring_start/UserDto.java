package com.smu8.s08_spring_start;

import org.jspecify.annotations.NonNull;
import org.springframework.web.bind.annotation.ModelAttribute;

public class UserDto {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
