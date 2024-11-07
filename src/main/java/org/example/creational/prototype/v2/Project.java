package org.example.creational.prototype.v2;

import java.util.ArrayList;
import java.util.List;

public class Project implements Cloneable{
    String name;
    List<Task> taskList;

    public Project(String name) {
        this.name = name;
        taskList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Task> getTaskList() {
        return taskList;
    }



    @Override
    protected Project clone() throws CloneNotSupportedException {
        Project projectClone = (Project) super.clone();
        projectClone.taskList = new ArrayList<>();
        for(Task task : taskList){
            projectClone.taskList.add(task.clone());
        }

        return projectClone;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", taskList=" + taskList +
                '}';
    }
}
