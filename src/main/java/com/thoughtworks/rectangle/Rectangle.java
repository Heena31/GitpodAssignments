package com.thoughtworks.rectangle;

public class Rectangle {

     public final double length;
     public final double breadth;

    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public double area()
    {
        return length*breadth;
    }

    
}
