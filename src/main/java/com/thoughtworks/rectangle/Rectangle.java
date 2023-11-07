package com.thoughtworks.rectangle;

public class Rectangle {

     int length;
     int breadth;

    Rectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public int area()
    {
        return length*breadth;
    }

    
}
