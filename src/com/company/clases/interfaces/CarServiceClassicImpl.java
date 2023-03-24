package com.company.clases.interfaces;

import com.company.clases.Car;
import com.company.clases.ElectricCar;

public class CarServiceClassicImpl implements CarService{
    @Override
    public Car crearCocheDemo() {
        System.out.println("Coche clasico creado");
        return new ElectricCar();
    }
}
