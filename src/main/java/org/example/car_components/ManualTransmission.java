package org.example.car_components;

public class ManualTransmission implements Transmission{

    @Override
    public void changeTransmission() {
        System.out.println("Перевести коробку передач в нужное положение.");
    }
}
