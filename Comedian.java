package Adapter;

public class Comedian extends Entertainer{
	private String special1;
	private String special2;
	public Comedian(String name,int age,char rating, int donation,String stage,String joke)
	{
		super(name, age, rating,donation);
		setName(name);
		setAge(age);
		setRating(rating);
		setSpecial1(stage);
		setSpecial2(joke);
	}
	public String getSpecial1() {
		return special1;
	}
	public void setSpecial1(String stage) {
		if(stage.length()<2) {
			special1="Heichal tarbot";
			return;
		}
		for(int i=0;i<stage.length();i++)
		{
			if((stage.toLowerCase().charAt(i)<'a')||(stage.toLowerCase().charAt(i)>'z'))
			{
				if(stage.charAt(i)!=' ')
				{
					special1="Heichal tarbot";
					return;
				}
			}
		}
		special1=stage;
		
	}
	public String getSpecial2() {
		return special2;
	}
	public void setSpecial2(String joke) {
		if(joke.length()<5) {
			special2="What's the best thing about Switzerland? I don't know, but the flag is a big plus.";
			return;
		}
		for(int i=0;i<joke.length();i++)
			if((joke.toLowerCase().charAt(i)<'a')||(joke.toLowerCase().charAt(i)>'z'))
			{
				if(joke.charAt(i)!=' '&& joke.charAt(i)!='?')
				{
					special2="What's the best thing about Switzerland? I don't know, but the flag is a big plus.";
					return;
				}
			}
		special2=joke;
	}

}
