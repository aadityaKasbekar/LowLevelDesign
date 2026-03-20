package ObserverDesignPattern.WeatherStation_Example.Observers;

import ObserverDesignPattern.WeatherStation_Example.Sujects.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements WeatherDataObserver {

	private static StatisticsDisplay sdInstance = null;
	private final List<Double> temperatureHistory;
	private final List<Double> humidityHistory;
	private final List<Double> pressureHistory;

	private StatisticsDisplay() {
		this.temperatureHistory = new ArrayList<>();
		this.humidityHistory = new ArrayList<>();
		this.pressureHistory = new ArrayList<>();
	}

	public static StatisticsDisplay getInstance() {
		if (sdInstance == null) {
			synchronized (StatisticsDisplay.class) {
				if (sdInstance == null) {
					sdInstance = new StatisticsDisplay();
				}
			}
		}
		return sdInstance;
	}

	public void trackData(Double temp, Double humidity, Double pressure) {
		this.temperatureHistory.add(temp);
		this.humidityHistory.add(humidity);
		this.pressureHistory.add(pressure);
	}

	public void displayAverageTemperature() {
		if (this.temperatureHistory.isEmpty()) {
			System.out.println("\nNo temperature data available to calculate average.");
			return;
		}

		Double sumTemp = 0.0;
		for (Double tempReading : this.temperatureHistory) {
			sumTemp += tempReading;
		}

		Double avgTemp = ((sumTemp) / this.temperatureHistory.size());
		System.out.printf("\nThe Average Temperature of Past %d Days is AvgTemp: %.2f F.", this.temperatureHistory.size(), avgTemp);
		System.out.println("");
	}

	@Override
	public void actionOnEvent(WeatherStation wsInstance) {
		this.trackData(wsInstance.getTemperature(), wsInstance.getHumidity(), wsInstance.getPressure());
		this.displayAverageTemperature();
	}
}
