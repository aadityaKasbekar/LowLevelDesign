package ObserverDesignPattern.WeatherStation_Example.Sujects;

import ObserverDesignPattern.WeatherStation_Example.Observers.WeatherDataObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherStationSubject {

	private static WeatherStation wsInstance = null;
	private double temperature;
	private double humidity;
	private double pressure;
	private final List<WeatherDataObserver> observersList;

	private WeatherStation() {
		this.observersList = new ArrayList<>();
	}

	public static WeatherStation getInstance() {
		if (wsInstance == null) {
			synchronized (WeatherStation.class) {
				if (wsInstance == null) {
					wsInstance = new WeatherStation();
				}
			}
		}
		return wsInstance;
	}

	@Override
	public void registerObserver(WeatherDataObserver observer) {
		this.observersList.add(observer);
	}

	@Override
	public void removeObserver(WeatherDataObserver observer) {
		this.observersList.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (WeatherDataObserver observer: this.observersList) {
			observer.actionOnEvent(this);
		}
	}

	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure  = pressure;
		this.notifyObserver();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
}
