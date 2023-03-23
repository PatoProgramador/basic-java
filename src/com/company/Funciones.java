package com.company;

public class Funciones {
    public static void main(String[] args) {
        // sin parametros
        holaMundo();
        // con parametros
        holaMundo("Pato");
        holaMundo("Pato", "Patoski"); //invocacion de la funcion sobrecargada
        holaMundo(2); // funcion sobrecargada pero con tipo de parametro diferente
        // Devolviendo un tipo de dato especifico
        String hola = devolverHolaMundo();
        System.out.println(hola);
    }
    // Funcion sin parametros
    public static void holaMundo() {
        System.out.println("Hola mundo desde un método");
    }
    // Funcion con parametros, ademas, sobrecarga de la primera
    protected static void holaMundo(String name) {
        System.out.println("Hola, " + name);
    }
    // Funcion con dos parametros, sobrecarga de la primera con los mismos tipos de datos
    protected static void holaMundo(String name, String lastName) {
        System.out.println("Hola " + name + " " + lastName);
    }
    // Primera funcion sobrecargada pero con tipo de dato por argumento diferente
    protected static void holaMundo(int number) {
        System.out.println("El numero es: " + number);
    }
    // Devolviendo un tipo de dato especifico
    private static String devolverHolaMundo() {
        return "Holis soy un String";
    }
}
