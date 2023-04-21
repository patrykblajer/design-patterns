package observer.notification;

import observer.WeatherForecast;

public interface Observer {
    void updateForecast(WeatherForecast weatherForecast);
}