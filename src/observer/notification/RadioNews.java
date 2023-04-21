package observer.notification;

import observer.WeatherForecast;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.printf("Radio - nowa prognoza pogody: temperatura: %d stopni, ciśnienie: %d\n",
                weatherForecast.getTemperature(), weatherForecast.getPressure());
    }
}