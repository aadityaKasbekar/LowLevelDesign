package ObserverDesignPattern.WeatherStation_Example;

import ObserverDesignPattern.WeatherStation_Example.Observers.CurrentConditionsDisplay;
import ObserverDesignPattern.WeatherStation_Example.Observers.StatisticsDisplay;
import ObserverDesignPattern.WeatherStation_Example.Sujects.WeatherStation;

public class Driver {
	public static void main(String[] args) {
		WeatherStation weatherStation = WeatherStation.getInstance();
		StatisticsDisplay statisticsDisplay = StatisticsDisplay.getInstance();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

		weatherStation.registerObserver(currentConditionsDisplay);
		weatherStation.registerObserver(statisticsDisplay);

		weatherStation.setMeasurements(25.0, 65.0, 1013.0);
		weatherStation.setMeasurements(28.0, 70.0, 1012.0);
		weatherStation.setMeasurements(22.0, 90.0, 1011.0);
	}
}
