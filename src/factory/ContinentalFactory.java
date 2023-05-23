package factory;

import factory.cars.*;

class ContinentalFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.LEFT;

    @Override
    public Car buildFord(FordModel model) {
        return switch (model) {
            case CMAX -> new Ford(2000, "diesel", 2023, position);
            case FOCUS -> new Ford(1600, "diesel", 2022, position);
        };
    }

    @Override
    public Car buildBmw(BmwModel model) {
        return switch (model) {
            case X5 -> new Bmw(2000, "gas", 2020, position);
            case SERIES_5 -> new Bmw(3000, "diesel", 2021, position);
        };
    }
}