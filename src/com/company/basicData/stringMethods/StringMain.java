package com.company.basicData.stringMethods;

public class StringMain {
    public static void main(String[] args) {
        /*
            length()
            startsWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            trim()
            equals()
            compareTo
         */
        String mensaje = "  Hola mundo  ";
        String mensaje2 = "HOLA MUNDO";

        String mensajeMod = mensaje.trim();

        System.out.println(mensaje.length());
        System.out.println(mensaje.trim());
        if(mensaje2.equalsIgnoreCase(mensajeMod)) {
            System.out.println("True");
        }
    }
}
