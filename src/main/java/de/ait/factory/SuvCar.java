package de.ait.factory;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class SuvCar extends Car {

    public SuvCar(String brand) {
        super(brand);
    }

    @Override
    void drive() {
        System.out.println("Круто гонять по бездорожью");
    }
}
