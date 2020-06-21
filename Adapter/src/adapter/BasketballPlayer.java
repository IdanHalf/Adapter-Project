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
		if(team.length()>1)
			for(int i=0;i<team.length();i++)
			{
				if(!(team.toLowerCase().charAt(i)>'a')&&(team.toLowerCase().charAt(i)>'z'))
					team="Golden State Warriors ";
			}
		else
			this.team=team;
	}
	public boolean isDunk() {
		return dunk;
	}
	public void setDunk(boolean dunk) {
		this.dunk = dunk;
	}
	
}
