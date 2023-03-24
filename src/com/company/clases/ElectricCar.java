package com.company.clases;

public class ElectricCar extends Car{

    String motorElectrico;

    public ElectricCar(){}

    public ElectricCar(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
