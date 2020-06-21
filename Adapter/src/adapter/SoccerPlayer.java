package adapter;

public class SoccerPlayer extends Athlete {
	private String team;
	private int bounce;
	public SoccerPlayer(String name,int age,double height,int rating,String team,int bounce)
	{
		super(name,age,height,rating);
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);
		setTeam(team);
		setBounce(bounce);
		
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		if(team.length()>1)
			for(int i=0;i<team.length();i++)
			{
				if(!(team.toLowerCase().charAt(i)>'a')&&(team.toLowerCase().charAt(i)>'z'))
					team="FCFalcons ";
			}
		else
			this.team=team;
		
	}
	public int getBounce() {
		return bounce;
	}
	public void setBounce(int bounce) {
		if(bounce>=0)
			this.bounce=bounce;
		else
			bounce=0;
	}
}
