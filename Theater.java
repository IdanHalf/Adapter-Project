package adapter;

public class Theater extends Entertainer{
	private String special1;
	private String special2;
	public Theater(String name,int age,char rating,String theater,String quote)
	{
		super(name, age, rating);
		setName(name);
		setAge(age);
		setRating(rating);
		setSpecial1(theater);
		setSpecial2(quote);
	}
	public String getSpecial1() {
		return special1;
	}
	public void setSpecial1(String theater) {
		if(theater.length()<5) {
			special1 ="Habima";
			return;
		}
		for(int i=0;i<theater.length();i++)
		{
			if((theater.toLowerCase().charAt(i)<'a')||(theater.toLowerCase().charAt(i)>'z'))
			{
				if(theater.charAt(i)!=' ')
				{
					special1="entertainer";
					return;
				}
			}
		}
		special1=theater;
		
	}
	public String getSpecial2() {
		return special2;
	}
	public void setSpecial2(String quote) {
		if(quote.length()<5) {
			special2="one does not simply walk into mordor";
			return;
		}
		for(int i=0;i<quote.length();i++)
			if((quote.toLowerCase().charAt(i)<'a')||(quote.toLowerCase().charAt(i)>'z'))
			{
				if(quote.charAt(i)!=' ')
				{
					special2="one does not simply walk into mordor";
					return;
				}
			}
		special2=quote;
	}
	
}
