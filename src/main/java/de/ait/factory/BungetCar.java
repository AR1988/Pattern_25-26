package de.ait.factory;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class BungetCar extends Car {

    public BungetCar(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println("Я еду и то хорошо");
    }
}
