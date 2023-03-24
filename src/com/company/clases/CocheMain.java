package com.company.clases;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "alfa romeo";
        Car cocheObj = new Car();

        Car cocheObj2 = new Car("rojo", "honda", "civic", 1430.45, 5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);
    }
}
