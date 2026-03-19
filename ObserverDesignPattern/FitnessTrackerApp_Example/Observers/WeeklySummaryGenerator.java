package ObserverDesignPattern.FitnessTrackerApp_Example.Observers;

import ObserverDesignPattern.FitnessTrackerApp_Example.Subjects.FitnessData;

public class WeeklySummaryGenerator implements FitnessDataObserver {
	private int totalSteps = 0;
	private int totalActiveMinutes = 0;
	private int totalCalories = 0;
	private int updateCount = 0;

	@Override
	public void actionOnEvent(FitnessData data) {
		totalSteps += data.getSteps();
		totalActiveMinutes += data.getActiveMinutes();
		totalCalories += data.getCalories();
		updateCount++;

		System.out.println("Weekly Summary -> Accumulated " + updateCount +
								   " updates. Total Steps: " + totalSteps);
	}

	public void generateReport() {
		System.out.println("\n=== Weekly Summary Report ===");
		System.out.println("Total Steps: " + totalSteps);
		System.out.println("Total Active Minutes: " + totalActiveMinutes);
		System.out.println("Total Calories: " + totalCalories);
		System.out.println("Data Points Collected: " + updateCount);
		System.out.println("Avg Steps/Update: " + (updateCount > 0 ? totalSteps / updateCount : 0));
	}

	public void reset() {
		totalSteps = 0;
		totalActiveMinutes = 0;
		totalCalories = 0;
		updateCount = 0;
	}
}
