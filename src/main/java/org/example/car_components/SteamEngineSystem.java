package org.example.car_components;

public class SteamEngineSystem implements EngineSystem {
    @Override
    public void charge() {
        System.out.println("Залить воду в цистерну... Засыпать уголь.");
    }

    @Override
    public void start() {
        System.out.println("Поджечь топливо... Прогреть цистерну... ");
    }

    @Override
    public void stop() {
        System.out.println("Остановить горенее топлива... Открыть внешний клапан сброса пара.");
    }
}
