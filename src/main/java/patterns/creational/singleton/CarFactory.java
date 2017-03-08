package patterns.creational.singleton;

public class CarFactory {

    private Integer numberOfCarsCreated;

    public CarFactory() {
        numberOfCarsCreated = 0;
    }

    public Car create(){
        Car car = new Car();
        numberOfCarsCreated++;

        return car;
    }

    public Integer getNumberOfCarsCreated() {
        return numberOfCarsCreated;
    }

}
