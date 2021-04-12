package com.linghao.Exercises_11_1;

import java.util.Date;

/**
 * @author zoulinghao
 * @create 2021-04-12-18:51
 */
public class GeometricObject {
    private String color="white";
    private boolean filled;
    private Date dateCreated;
    public GeometricObject(){
        dateCreated=new Date();
    }
    public GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Create on "+dateCreated+"\ncolor: "+color+" and filled "+filled;
    }
}
