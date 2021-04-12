package com.linghao.Exercises_11_2;

import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:24
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private Date date;

    public Employee(String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Employee = "+getName();
    }
}
