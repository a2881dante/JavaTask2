package org.example.car_models;

import org.example.car_components.AutoTransmission;
import org.example.car_components.ElectricityEngineSystem;
import org.example.car_markers.OnSaleAvailability;

public class Tesla extends Car implements OnSaleAvailability {
    public Tesla(){
        this.engine = new ElectricityEngineSystem();
        this.transmission = new AutoTransmission();
    }
    @Override
    void drive() {
        System.out.println("Выставить точку назначение на карте... Включить автопилот... ");
    }

    @Override
    public String toString() {
        return "Tesla";
    }
}
