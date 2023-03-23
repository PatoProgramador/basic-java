package com.company;

public class Funciones {
    public static void main(String[] args) {
        // sin parametros
        holaMundo();
        // con parametros
        holaMundo2("Pato");
        // Devolviendo un tipo de dato especifico
        String hola = devolverHolaMundo();
        System.out.println(hola);
    }
    // Funcion sin parametros
    public static void holaMundo() {
        System.out.println("Hola mundo desde un método");
    }
    // Funcion con parametros
    protected static void holaMundo2(String name) {
        System.out.println("Hola, " + name);
    }
    // Devolviendo un tipo de dato especifico
    private static String devolverHolaMundo() {
        return "Holis soy un String";
    }
}
