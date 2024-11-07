package org.example.creational.prototype.v2;

public class Task implements Cloneable{
    String name;
    String status;

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    protected Task clone() throws CloneNotSupportedException {
        return (Task) super.clone();
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
