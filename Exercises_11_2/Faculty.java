package com.linghao.Exercises_11_2;

import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:29
 */
public class Faculty extends Employee {
    private Date workTime;
    private int level;

    public Faculty(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Faculty = "+getName();
    }
}
