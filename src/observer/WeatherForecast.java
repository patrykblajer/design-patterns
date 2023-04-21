package observer;

import observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private final Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.updateForecast(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public Set<Observer> getRegisteredObservers() {
        return registeredObservers;
    }

    public void updateForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }
}