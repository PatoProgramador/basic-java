package com.company.basicData.dataStructures.listas;

public class Person {
    String name = "nombre de la persona";

    public Person() {}
    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
