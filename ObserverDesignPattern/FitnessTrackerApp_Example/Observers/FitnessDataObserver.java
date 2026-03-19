package ObserverDesignPattern.FitnessTrackerApp_Example.Observers;

import ObserverDesignPattern.FitnessTrackerApp_Example.Subjects.FitnessData;

public interface FitnessDataObserver {
	void actionOnEvent(FitnessData data);
}
