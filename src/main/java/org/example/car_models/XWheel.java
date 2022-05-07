package org.example.car_models;

import org.example.car_components.AutoTransmission;
import org.example.car_components.ElectricityEngineSystem;
import org.example.car_components.PistonEngineSystem;
import org.example.car_components.SolidTransmission;

public class XWheel extends Car {
    public XWheel() {
        this.engine = new ElectricityEngineSystem();
        this.transmission = new SolidTransmission();
    }
    @Override
    void drive() {
        System.out.println("Летим... ");
    }

    @Override
    public String toString() {
        return "XWheel";
    }
}
