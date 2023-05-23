package factory;

import factory.CommonwealthFactory;
import factory.ContinentalFactory;
import factory.Factory;
import factory.cars.BmwModel;
import factory.cars.Car;
import factory.cars.FordModel;

class Main {
    public static void main(String[] args) {
        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car bmw = commonwealthFactory.buildBmw(BmwModel.SERIES_5);
        System.out.println(bmw.getPosition());

        Car ford = continentalFactory.buildFord(FordModel.CMAX);
        System.out.println(ford.getPosition());
    }
}