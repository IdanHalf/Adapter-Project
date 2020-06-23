package adapter;

public class GoalKeeper extends Athlete {
	private String team;
	private int saves;
	public GoalKeeper(String name,int age,double height,int rating,String team,int saves)
	{
		super(name,age,height,rating);
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);
		setTeam(team);
		setSaves(saves);
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		if(team.length()<1) {
			this.team="FCFalcons ";
			return;
		}
		for(int i=0;i<team.length();i++)
		{
			if(!(team.toLowerCase().charAt(i)>'a')&&(team.toLowerCase().charAt(i)<'z')) {
				team="FCFalcons ";
				return;
			}
		}
			this.team=team;
		
	}
	public int getSaves() {
		return saves;
	}
	public void setSaves(int saves) {
		if(saves>=0)
			this.saves=saves;
		else
			saves=0;
	}

}
