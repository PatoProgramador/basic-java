package com.company;

public class PruebaFunciones {
    public static void main(String[] args) {
        // ambito public: desde cualquier lugar
        Funciones.holaMundo();
        // ambito protected: solo las clases hijas o del mismo paquete pueden acceder
        Funciones.holaMundo2("Pato de otra clase");
        // private: solo desde la misma clase
        int number1 = sum(2,2);
        System.out.println(number1);
    }
    //Siempre que se retorne un tipo de dato, se debe especificar en el ambito
    // de la función, las funciones "void" no suelen retornar nada
    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
