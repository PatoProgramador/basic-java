package com.company.clases;

public class PolimorfismoMain {
    public static void main(String[] args) {

        ElectricCar coche2 = new ElectricCar();

        // polimorfismo
        Car coche4 = new ElectricCar();

        if (coche4 instanceof ElectricCar && coche4 instanceof Car) {
            System.out.println("Si es un coche electrico e instancia del modelo padre");
        }
    }
}
