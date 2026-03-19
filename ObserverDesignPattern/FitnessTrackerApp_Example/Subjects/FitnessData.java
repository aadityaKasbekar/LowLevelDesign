package ObserverDesignPattern.FitnessTrackerApp_Example.Subjects;

import ObserverDesignPattern.FitnessTrackerApp_Example.Observers.FitnessDataObserver;

import java.util.ArrayList;
import java.util.List;

public class FitnessData implements FitnessDataSubject {
	private int steps;
	private int activeMins;
	private int calories;

	private final List<FitnessDataObserver> observersList = new ArrayList<>();

	@Override
	public void registerObserver(FitnessDataObserver observer) {
		observersList.add(observer);
	}

	@Override
	public void removeObserver(FitnessDataObserver observer) {
		observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (FitnessDataObserver observer : observersList) {
			observer.actionOnEvent(this);
		}
	}

	public void newFitnessDataPushed(int steps, int activeMinutes, int calories) {
		this.steps = steps;
		this.activeMins = activeMinutes;
		this.calories = calories;

		System.out.println("\nFitnessData: New data received – Steps: " + steps +
								   ", Active Minutes: " + activeMinutes + ", Calories: " + calories);

		notifyObservers();
	}

	public void dailyReset() {
		this.steps = 0;
		this.activeMins = 0;
		this.calories = 0;

		System.out.println("\nFitnessData: Daily reset performed.");
		notifyObservers();
	}

	public int getSteps() { return steps; }
	public int getActiveMinutes() { return activeMins; }
	public int getCalories() { return calories; }
}
