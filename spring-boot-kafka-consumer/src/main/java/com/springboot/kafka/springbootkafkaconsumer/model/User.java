package com.springboot.kafka.springbootkafkaconsumer.model;

import java.util.Objects;

public class User {
    private String name;
    private String dept;
    private Long salary;

    public User(String name, String dept, Long salary) {
        this.setName(name);
        this.setDept(dept);
        this.setSalary(salary);
    }

    public User(String name, String dept) {
        this.setName(name);
        this.setDept(dept);
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
