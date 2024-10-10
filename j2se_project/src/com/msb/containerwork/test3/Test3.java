package com.msb.containerwork.test3;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * 实现如下功能：
 * 创建一个ArrayList容器
 * 添加5个员工到容器中，每个员工的工号必须不同
 * 写一个静态方法实现用增强For循环打印每个员的员工工号、岗位以及工资
 * 写一个静态方法打印出工资低于5000元的员工所有信息
 */
public class Test3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "鲍勃", "测试", 10000, LocalDate.of(2025,3,15)));
        list.add(new Employee(2, "才能", "测试", 10000, LocalDate.of(2025,3,15)));
        list.add(new Employee(3, "书店", "测试", 1000, LocalDate.of(2025,3,15)));
        list.add(new Employee(4, "礼券", "测试", 10000, LocalDate.of(2025,3,15)));
        list.add(new Employee(5, "是的", "测试", 4000, LocalDate.of(2025,3,15)));
        print(list);
        printSalary(list);


    }

    public static void print(ArrayList<Employee> list) {

        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    public static void printSalary(ArrayList<Employee> list){
        for (Employee Salary:list){
            if(Salary.getSalary()<5000){
                System.out.println(Salary);
            }
        }
    }
}