package org.example.creational.prototype.v1;


public class Circle extends ShapeForm {

    public Circle() {
        type = "circle";
    }

    @Override
    void draw() {
        System.out.println("drawing " + type);
    }
}
