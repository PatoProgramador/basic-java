package com.company;

public class Tipos {
    public static void main(String[] args) {
        // ¿Cómo se declara una variable?
        // 1) tipo - identificador = valor;
        // 2) tipo - identificador;

        //TIPOS PRIMITIVOS
        // enteros
        byte number1 = 1; // 1 byte
        short number2 = 2; // 2 bytes
        int number3 = 3; // 4 bytes
        long number4 = 4; // 8 bytes

        // punto flotante
        float decimal1 = 4.9f;
        double decimal2 = 9.99d; //mayor capacidad que float

        // caracter
        char carater1 = 'a';

        // booleanos
        boolean verdadero = true;
        boolean falso = false;

        // cadenas de texto
        String nombre = "Pato";
        String nombre2 = "Patoso";

        //TIPOS ENVOLTORIO
        //tipos primitivos pero en clases, lo cual permite definir
        //en casos de necesario por ejemplo una variable null

        Integer numero = null;
        Long numero2 = 2L;
    }
}
