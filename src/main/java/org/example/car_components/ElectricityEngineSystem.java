package org.example.car_components;

public class ElectricityEngineSystem implements EngineSystem {
    @Override
    public void charge() {
        System.out.println("Поставить батарею на зарядку.");
    }

    @Override
    public void start() {
        System.out.println("Запустить батареи... Раскрутить асинхронный ротор... ");
    }

    @Override
    public void stop() {
        System.out.println("Остановить ротор... Отвести остаточное напряжение.");
    }
}
