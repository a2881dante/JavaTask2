package org.example.car_models;

import org.example.car_components.EngineSystem;
import org.example.car_components.Transmission;

public abstract class Car {
    protected EngineSystem engine;

    protected Transmission transmission;

    abstract void drive();

    public void move() {
        engine.start();
        drive();
        engine.stop();
    }

    public void charge() {
        engine.charge();
    }

    public void changeTransmission() {
        transmission.changeTransmission();
    }
}
