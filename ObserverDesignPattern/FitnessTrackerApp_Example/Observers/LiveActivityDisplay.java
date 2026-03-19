package ObserverDesignPattern.FitnessTrackerApp_Example.Observers;

import ObserverDesignPattern.FitnessTrackerApp_Example.Subjects.FitnessData;

public class LiveActivityDisplay implements FitnessDataObserver {
	@Override
	public void actionOnEvent(FitnessData data) {
		System.out.println("Live Display → Steps: " + data.getSteps() +
								   " | Active Minutes: " + data.getActiveMinutes() +
								   " | Calories: " + data.getCalories());
	}
}
