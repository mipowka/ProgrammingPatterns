package org.example.creational.prototype.v1;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circleOriginal = new Circle();
        Circle circleClone = (Circle) circleOriginal.clone();
        circleOriginal.draw();
        circleClone.draw();
        System.out.println(circleOriginal);
        System.out.println(circleClone);
    }
}
