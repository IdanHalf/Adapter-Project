package Adapter;

public class GoalKeeperAdapter implements AllPlayerAdapter {
	GoalKeeper goalKeeper;
	public GoalKeeperAdapter(GoalKeeper newGoalKeeper)
	{
		goalKeeper = newGoalKeeper;
	}
	public String getName() {
		return goalKeeper.getName();
	}
	public String getAge() {
		return String.valueOf(goalKeeper.getAge());
	}
	public String getHeight() {
		return String.valueOf(goalKeeper.getHeight());
	}
	public String getRating() {
		return String.valueOf(goalKeeper.getRating());
	}
	public String getSpecial1() {
		return goalKeeper.getSpecial1();
	}
	public String getSpecial2() {
		return String.valueOf(goalKeeper.getSpecial2());
	}

}
