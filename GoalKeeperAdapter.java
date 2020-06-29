package adapter;

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
	public String getDonation() {
		return String.valueOf(goalKeeper.getDonation());
		}
	public String getSpecial1() {
		return goalKeeper.getSpecial1();
	}
	public String getSpecial2() {
		return String.valueOf(goalKeeper.getSpecial2());
	}
	public void print() {
		System.out.println("Hi i donated: "+getDonation()+"$ my name is: "+getName()+", i am "+getAge()+" years old, my height is "+getHeight()+"m, my rating is: "+getRating()+", im a Goalkeeper for: "+getSpecial1()+" and i made "+getSpecial2()+" saves");	
	}

}
