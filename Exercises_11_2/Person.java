package com.linghao.Exercises_11_2;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:23
 */
public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Person(){

    }

    @Override
    public String toString() {
        return "Person = "+name;
    }
}
