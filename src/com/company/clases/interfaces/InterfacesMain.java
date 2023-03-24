package com.company.clases.interfaces;

import com.company.clases.Car;

public class InterfacesMain {
    public static void main(String[] args) {
        CarService service = new CarServiceClassicImpl();

        Car coche1 = service.crearCocheDemo();
    }
}
