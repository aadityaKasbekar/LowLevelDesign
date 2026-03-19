package ObserverDesignPattern.FitnessTrackerApp_Example.Observers;

import ObserverDesignPattern.FitnessTrackerApp_Example.Subjects.FitnessData;

public class GoalNotifier implements FitnessDataObserver {
	private final int stepGoal = 10000;
	private boolean goalReached = false;

	@Override
	public void actionOnEvent(FitnessData data) {
		if (data.getSteps() >= stepGoal && !goalReached) {
			System.out.println("Notifier → 🎉 Goal Reached! You've hit " + stepGoal + " steps!");
			goalReached = true;
		}
	}

	public void reset() {
		goalReached = false;
	}
}
