package ObserverDesignPattern.FitnessTrackerApp_Example.Subjects;

import ObserverDesignPattern.FitnessTrackerApp_Example.Observers.FitnessDataObserver;

public interface FitnessDataSubject {
	void registerObserver(FitnessDataObserver observer);
	void removeObserver(FitnessDataObserver observer);
	void notifyObservers();
}
