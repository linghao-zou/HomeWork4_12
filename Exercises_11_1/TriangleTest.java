package com.linghao.Exercises_11_1;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-04-12-19:09
 */
public class TriangleTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter the side1 :");
        double side1 = in.nextDouble();
        System.out.println("Please enter the side2 :");
        double side2 = in.nextDouble();
        System.out.println("Please enter the side3 :");
        double side3 = in.nextDouble();
        System.out.println("Please enter the color : ");
        String color = in.next();
        System.out.println("Please enter the filled :");
        boolean filled = in.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The triangle's area is "+triangle.getArea());
        System.out.println("The triangle's perimeter is "+triangle.getPerimeter());
        System.out.println("The color is "+triangle.getColor());
        System.out.println("The filled is " + triangle.isFilled());

    }
}
