package org.example.creational.prototype.v2;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Project realProject = new Project("super project");
        realProject.taskList.add(new Task("napisat constructor","active"));
        realProject.taskList.add(new Task("popit kofe","waiting"));

        Project projectClone = realProject.clone();

        realProject.getTaskList().get(0).status = "done";

        System.out.println(realProject);
        System.out.println(projectClone);

    }
}
