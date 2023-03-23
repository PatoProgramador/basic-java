package com.company;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while(count <= 10){
            count++;
            if(count == 6) break; //continue; salta el valor 6 y sigue iterando
            // break encuentra el valor y para las iteraciones
            System.out.println("Holis " + count);
        }
    }
}
