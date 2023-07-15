package de.ait.factory;

import de.ait.factory.CarType.CarTypeEnum;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class CarFactory {

    private String repoService;

    public CarFactory() {
    }

    public Car createCar(CarTypeEnum carType, String brand) {
        switch (carType) {
            case SPORT: {
                return new SportCar(brand);
            }
            case SUV:
                return new SuvCar(brand);
            case BUDGET:
                return new BungetCar(brand);
            default:
                throw new IllegalArgumentException("Машина " + carType + " снята с производства");
        }
    }
}
