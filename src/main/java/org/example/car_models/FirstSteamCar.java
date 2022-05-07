package org.example.car_models;

import org.example.car_components.SolidTransmission;
import org.example.car_components.SteamEngineSystem;

public class FirstSteamCar extends Car{
    public FirstSteamCar() {
        this.engine = new SteamEngineSystem();
        this.transmission = new SolidTransmission();
    }

    @Override
    void drive() {
        System.out.println("Медлено едем... ");
    }

    @Override
    public String toString() {
        return "First Steam Car";
    }
}
