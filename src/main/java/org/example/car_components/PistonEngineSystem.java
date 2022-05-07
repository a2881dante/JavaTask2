package org.example.car_components;

public class PistonEngineSystem implements EngineSystem {
    @Override
    public void charge() {
        System.out.println("Залить топливо в бак.");
    }

    @Override
    public void start() {
        System.out.println("Открыть топливные клапаны... Прогреть двигатель... ");
    }

    @Override
    public void stop() {
        System.out.println("Остановить движение поршней... Закріть все клапаны.");
    }
}
