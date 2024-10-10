package com.msb.containerwork.test3;

import java.time.LocalDate;

public class Employee {
    int code;
    String name;
    String job;
    int salary;
    LocalDate entryTime;

    public Employee() {
    }

    public Employee(int code, String name, String job, int salary) {
        this.code = code;
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public Employee(int code, String name, String job, int salary, LocalDate entryTime) {
        this.code = code;
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.entryTime = entryTime;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDate entryTime) {
        this.entryTime = entryTime;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                ", entryTime=" + entryTime +
                '}';
    }
}
