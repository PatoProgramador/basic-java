package com.company.controlStructures;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 5 < 10;

        int number1 = 5;
        int number2 = 10;
        int number3 = 20;
        int number4 = 1000;


        if(number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        } else if(number3 < number4) {
            System.out.println("else if");
        } else {
            System.out.println("falso");
        }

        System.out.println("fin");
    }
}
