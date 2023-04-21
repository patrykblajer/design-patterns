package observer.notification;

import observer.WeatherForecast;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf("InternetNews - nowa prognoza pogody: temperatura: %d stopni, ciśnienie: %d\n",
                weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}