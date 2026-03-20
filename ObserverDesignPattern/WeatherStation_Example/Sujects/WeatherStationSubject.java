package ObserverDesignPattern.WeatherStation_Example.Sujects;

import ObserverDesignPattern.WeatherStation_Example.Observers.WeatherDataObserver;

public interface WeatherStationSubject {
	void registerObserver(WeatherDataObserver observer);
	void removeObserver(WeatherDataObserver observer);
	void notifyObserver();
}
