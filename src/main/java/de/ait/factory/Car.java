package de.ait.factory;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public abstract class Car {

    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    abstract void drive();
}
