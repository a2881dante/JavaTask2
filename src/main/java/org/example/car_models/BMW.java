package org.example.car_models;

import org.example.car_components.AutoTransmission;
import org.example.car_components.PistonEngineSystem;
import org.example.car_markers.OnSaleAvailability;

public class BMW extends Car implements OnSaleAvailability {
    public BMW() {
        this.engine = new PistonEngineSystem();
        this.transmission = new AutoTransmission();
    }

    @Override
    void drive() {
        System.out.println("Едем...");
    }

    @Override
    public String toString() {
        return "BMW";
    }
}
