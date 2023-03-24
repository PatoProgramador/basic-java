package com.company.basicData.dataStructures.arrays;
import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        int[] notas = new int[10];
        int[] notas2 = {8, 10, 5, 9, 8, 7, 5, 6};

        notas[0] = 8;
        notas[1] = 9;

        System.out.println(notas[0]);

        for (int i = 0; i < notas2.length; i++) {
            System.out.println(notas2[i]);
        }

        // Declaracion de un for each
        System.out.println("ForEach");
        for(int item:notas2){
            System.out.println(item);
        }
        // Ejemplo de metodo de array
        System.out.println("Sort");
        Arrays.sort(notas2);
        for(int item:notas2){
            System.out.println(item);
        }
    }
}
