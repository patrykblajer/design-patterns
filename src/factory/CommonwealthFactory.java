package factory;

import factory.cars.*;

class CommonwealthFactory implements Factory {

    SteeringWheelPosition position = SteeringWheelPosition.RIGHT;

    @Override
    public Car buildFord(FordModel model) {
        switch(model) {
            case CMAX:
                return new Ford(2000,"benzine",2023, position);
            case FOCUS:
                return new Ford(1600,"diesel",2022, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }

    @Override
    public Car buildBmw(BmwModel model) {
        switch(model) {
            case X5:
                return new Bmw(2000,"benzine",2020, position);
            case SERIES_5:
                return new Bmw(3000,"diesel",2021, position);
            default:
                throw new IllegalArgumentException("Unknown model");
        }
    }
}