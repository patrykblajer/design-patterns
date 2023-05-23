package factory.cars;

public abstract class Car {

    private int engineCapacity;
    private String fuelType;
    private int year;
    private SteeringWheelPosition position;

    protected Car(int engineCapacity, String fuelType, int year, SteeringWheelPosition position) {
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.year = year;
        this.position = position;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getYear() {
        return year;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}