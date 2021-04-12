package com.linghao.Exercises_11_2;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:30
 */
public class Staff extends Employee {
    private String staffName;

    public Staff(String name){
        super(name);
    }
    @Override
    public String toString() {
        return "Staff = " +getName();
    }
}
