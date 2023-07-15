package de.ait.factory;

import de.ait.factory.CarType.CarTypeEnum;

import java.util.stream.Stream;

/**
 * @author Andrej Reutow
 * created on 15.07.2023
 */
public class PatternFactoryMain {

    public static void main(String[] args) {
        Car sportCar = new SportCar("MC");
        Car suvCar = new SuvCar("Audi");

        print(Stream.of(sportCar, suvCar));

        createCarsWithFactory();
    }

    public static void createCarsWithFactory() {
        CarFactory carFactory = new CarFactory();

        Car sportCar = carFactory.createCar(CarTypeEnum.SPORT, "MC");
        Car suvCar = carFactory.createCar(CarTypeEnum.SUV, "Audi");

        if (sportCar instanceof SportCar) {
            ((SportCar) sportCar).setOwner("Andre");
        }

        print(Stream.of(sportCar, suvCar));
    }

    private static void print(Stream<Car> carStream) {
//        List<Car> cars = List.of(sportCar, suvCar);
//        cars.stream().forEach(Car::drive);

//        Stream<Car> carStream = Stream.of(suvCar, sportCar);
        carStream
                .peek(car -> System.out.println(car.getClass().getName()))
                .forEach(car -> car.drive());
    }
}
