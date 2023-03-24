package com.company.basicData.dataStructures.listas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        // for each sobre la lista
        for( String nombre: nombres) {
            System.out.println(nombre);
        }

        List<Person> personas = new ArrayList<>();

        personas.add(new Person("Pato"));
        personas.add(new Person("PatoProgramador"));
        personas.add(new Person("PatoFilosofo"));
        personas.add(new Person("PatoBilingue"));

        System.out.println(personas);
    }
}
