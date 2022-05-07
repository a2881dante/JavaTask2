package org.example;


import org.example.car_markers.OnSaleAvailability;
import org.example.car_models.*;

public class App {
    public static void main( String[] args ) {
        Car[] cars = {
                new FirstSteamCar(),
                new BMW(),
                new Camaro(),
                new Tesla(),
                new XWheel()
        };

        for (Car car: cars) {
            System.out.println(car);
            car.charge();
            car.move();
            System.out.println();
        }

        System.out.println("Машины для продажи");
        for (Car car: cars) {
            if(car instanceof OnSaleAvailability) {
                System.out.println(car);
            }
        }
    }
}
