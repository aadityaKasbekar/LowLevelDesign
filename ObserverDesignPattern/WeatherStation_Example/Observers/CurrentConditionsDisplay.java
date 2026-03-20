package ObserverDesignPattern.WeatherStation_Example.Observers;

import ObserverDesignPattern.WeatherStation_Example.Sujects.WeatherStation;

public class CurrentConditionsDisplay implements WeatherDataObserver {

	public void displayCurrentConditions(Double temp, Double humidity, Double pressure) {
		System.out.printf("\nCurrent Conditions =>> TEMP: %.2f F, Humidity: %.2f, Pressure: %.2f inHg", temp, humidity, pressure);
	}

	@Override
	public void actionOnEvent(WeatherStation wsInstance) {
		this.displayCurrentConditions(wsInstance.getTemperature(), wsInstance.getHumidity(), wsInstance.getPressure());
	}
}
