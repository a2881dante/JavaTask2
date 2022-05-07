package org.example.car_models;

import org.example.car_components.AutoTransmission;
import org.example.car_components.ManualTransmission;
import org.example.car_components.PistonEngineSystem;
import org.example.car_markers.OnSaleAvailability;

public class Camaro extends Car implements OnSaleAvailability {
    public Camaro() {
        this.engine = new PistonEngineSystem();
        this.transmission = new ManualTransmission();
    }
    @Override
    void drive() {
        System.out.println("Едем...");
    }

    @Override
    public String toString() {
        return "Camaro";
    }
}
