package com.msb.j2se.oop.testenum;

/**
 * 员工
 */
public class Employee {
    //正常
    public static final int NORMAL=1;
    //迟到
    public static final int LATE=2;
    //早退
    public static final int LEAVE_EARLY=3;
    //请假
    public static final int LEAVE=4;
    //旷工
    public static final  int ABSENTEEISM=5;

    String code;
    int state;

    public Employee(String code, int state) {
        this.code = code;
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
