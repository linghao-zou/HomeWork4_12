package com.linghao.Exercises_11_2;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:36
 */
public class HomeWork_11_2_Test {
    public static void main(String[] args) {
        Person person = new Person("person");
        Student student = new Student("student");
        Employee employee = new Employee("employee");
        Faculty faculty = new Faculty("faculty");
        Staff staff = new Staff("staff");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}
