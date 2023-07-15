package de.ait.factory;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class SportCar extends Car {

    private String owner;

    public SportCar(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println("Едет быстро спортивная машина");
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
