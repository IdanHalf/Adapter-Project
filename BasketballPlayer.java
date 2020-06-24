package adapter;

public class BasketballPlayer extends Athlete {
	private String special1;
	private boolean special2;
	public BasketballPlayer(String name,int age,double height,int rating,String team,boolean dunk) {
		super(name, age, height, rating);
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);
		setSpecial1(team);
		setSpecial2(dunk);
		
	}
	public String getSpecial1() {
		return special1;
	}
	public void setSpecial1(String team) {
		if(team.length()<2) {
			special1="Golden State Warriors";
			return;
		}
		for(int i=0;i<team.length();i++)
		{
			if((team.toLowerCase().charAt(i)<'a')||(team.toLowerCase().charAt(i)>'z'))
			{
				if(team.charAt(i)!=' ')
				{
					special1="Golden State Warriors";
					return;
				}
			}
		}
			special1=team;
	}
	public boolean getSpecial2() {
		return special2;
	}
	public void setSpecial2(boolean dunk) {
		special2 = dunk;
	}
	
}
