package com.linghao.Exercises_11_1;

/**
 * @author zoulinghao
 * @create 2021-04-12-18:50
 */
public class Triangle extends  GeometricObject {
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle() {
        super();
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    /**
     * 获取三角形的周长
     * @return
     */
    public double getPerimeter(){
        return side1+side2+side3;
    }

    public double getArea(){
        return Math.sqrt((this.getPerimeter()/2)*(this.getPerimeter()/2-side1)*(this.getPerimeter()/2-side2)*(this.getPerimeter()/2-side3));
    }
    @Override
    public String toString() {
        return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3 ;
    }
}
