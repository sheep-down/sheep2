package com.msb.j2se.oop.day1.testpkg;

public class TestDatabaseConfig {
    public static void main(String[] args) {
        //创建对象
        DatabaseConfig config=new DatabaseConfig();
        //赋值
        config.driveName="com.mysql.jdbc.Driver";

        //创建对象
        DatabaseConfig config2=new DatabaseConfig();
        //赋值
        config2.driveName="com.jdbc.oracle.Driver";
    }
}
