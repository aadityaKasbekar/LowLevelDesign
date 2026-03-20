package ObserverDesignPattern.WeatherStation_Example.Observers;

import ObserverDesignPattern.WeatherStation_Example.Sujects.WeatherStation;

public interface WeatherDataObserver {
	void actionOnEvent(WeatherStation instance);
}
