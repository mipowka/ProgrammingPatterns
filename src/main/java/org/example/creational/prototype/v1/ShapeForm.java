package org.example.creational.prototype.v1;

public abstract class ShapeForm implements Cloneable{
    protected String type;

    abstract void draw();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getType() {
        return type;
    }
}
