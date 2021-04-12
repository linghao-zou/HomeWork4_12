package com.linghao.Review;

import javax.swing.text.AsyncBoxView;

/**
 * @author zoulinghao
 * @create 2021-04-12-20:05
 */
public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * Math.PI ;
    }
}
class BB extends Circle{

    private double length;
    public BB(double radius,double length) {
        Circle(radius);
        length=length;
    }

    @Override
    public double getArea() {
        return getArea() * length;
    }
}