package adapter;

public class BasketballPlayer extends Athlete {
	private String team;
	private boolean dunk;
	public BasketballPlayer(String name,int age,double height,int rating,String team,boolean dunk) {
		super(name, age, height, rating);
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);
		setTeam(team);
		setDunk(dunk);
		
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		if(team.length()<2) {
			this.team="Golden State Warriors";
			return;
		}
		for(int i=0;i<team.length();i++)
		{
			if((team.toLowerCase().charAt(i)<'a')||(team.toLowerCase().charAt(i)>'z'))
			{
				if(team.charAt(i)!=' ')
				{
					this.team="Golden State Warriors";
					return;
				}
			}
		}
			this.team=team;
	}
	public boolean isDunk() {
		return dunk;
	}
	public void setDunk(boolean dunk) {
		this.dunk = dunk;
	}
	
}
