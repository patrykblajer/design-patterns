package observer.notification;

import observer.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf("Telewizja - nowa prognoza pogody: temperatura: %d stopni, ciśnienie: %d\n",
                weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}