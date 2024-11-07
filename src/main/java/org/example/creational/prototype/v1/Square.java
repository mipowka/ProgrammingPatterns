package org.example.creational.prototype.v1;

public class Square extends ShapeForm {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("drawing " + type);
    }
}
