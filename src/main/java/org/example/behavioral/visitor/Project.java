package org.example.behavioral.visitor;

public class Project implements ProjectElement {
    ProjectElement[] elements;

    public Project() {
        this.elements = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : elements) {
            element.beWritten(developer);
        }
    }
}
