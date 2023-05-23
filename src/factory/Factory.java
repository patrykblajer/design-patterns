package factory;

import factory.cars.BmwModel;
import factory.cars.Car;
import factory.cars.FordModel;

interface Factory {

    Car buildFord(FordModel model);

    Car buildBmw(BmwModel model);
}