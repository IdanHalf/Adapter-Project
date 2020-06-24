package adapter;

public class GoalKeeper extends Athlete {
	private String special1;
	private int special2;
	public GoalKeeper(String name,int age,double height,int rating,String team,int saves)
	{
		super(name,age,height,rating);
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);
		setSpecial1(team);
		setSpecial2(saves);
	}
	public String getSpecial1() {
		return special1;
	}
	public void setSpecial1(String team) {
		if(team.length()<2) {
			special1="FCFalcons";
			return;
		}
		for(int i=0;i<team.length();i++)
		{
			if((team.toLowerCase().charAt(i)<'a')||(team.toLowerCase().charAt(i)>'z'))
			{
				if(team.charAt(i)!=' ')
				{
					special1="FCFalcons";
					return;
				}
			}
		}
			special1=team;
		
	}
	public int getSpecial2() {
		return special2;
	}
	public void setSpecial2(int saves) {
		if(saves>=0)
			special2=saves;
		else
			special2=0;
	}

}
