package com.linghao.Exercises_11_2;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:25
 */
public class Student extends Person {
    private final String CLASS_STATUS1="大一";
    private final String CLASS_STATUS2="大二";
    private final String CLASS_STATUS3="大三";
    private final String CLASS_STATUS4="大四";

    public Student(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Student = " + getName();
    }
}
