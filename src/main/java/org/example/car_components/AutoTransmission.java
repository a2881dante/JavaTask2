package org.example.car_components;

public class AutoTransmission implements Transmission{
    @Override
    public void changeTransmission() {
        System.out.println("Переключить коробку передач.");
    }
}
