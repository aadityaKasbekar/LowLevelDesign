package ObserverDesignPattern.FitnessTrackerApp_Example.Observers;

import ObserverDesignPattern.FitnessTrackerApp_Example.Subjects.FitnessData;

public class ProgressLogger implements FitnessDataObserver {
	@Override
	public void actionOnEvent(FitnessData data) {
		System.out.println("Logger → Saving to DB: Steps=" + data.getSteps() +
								   ", ActiveMinutes=" + data.getActiveMinutes() +
								   ", Calories=" + data.getCalories());
		// Simulated DB/file write...
	}
}
