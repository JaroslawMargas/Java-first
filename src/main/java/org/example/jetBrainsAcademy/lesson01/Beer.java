package org.example.jetBrainsAcademy.lesson01;

public class Beer {

    private final String name;

    public Beer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                '}';
    }
}
