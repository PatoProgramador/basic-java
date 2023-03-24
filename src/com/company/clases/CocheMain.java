package com.company.clases;

public class CocheMain {
    public static void main(String[] args) {

        ElectricCar cocheElectrico = new ElectricCar();

        cocheElectrico.motorElectrico = "Ejemplito";
        cocheElectrico.color = "verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.modelo = "civic";

        System.out.println(cocheElectrico);

        ElectricCar cocheElectrico2 = new ElectricCar("rojo", "alfa",
                "romeo", 1550.5, 4.99, "ejemplito");

        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);
    }
}
