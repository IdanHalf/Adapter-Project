package adapter;

public class Entertainer {
	private String name;
	private int age;
	private char rating;
	public Entertainer(String name,int age,int rating){
		setName(name);
		setAge(age);
		setRating(rating);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2) {
			this.name="entertainer";
			return;
		}
		for(int i=0;i<name.length();i++)
		{
			if((name.toLowerCase().charAt(i)<'a')||(name.toLowerCase().charAt(i)>'z'))
			{
				if(name.charAt(i)!=' ')
				{
					this.name="entertainer";
					return;
				}
			}
		}
			this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>17&&age<66)
			this.age=age;
		else
			age=25;
	}
	public char getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating<100&& rating>90)
			this.rating='A';
		if(rating<90&& rating>80)	
			this.rating='B';
		if(rating<80&& rating>70)
			this.rating='C';
		if(rating<70&& rating>60)
			this.rating='D';
		if(rating<60&& rating>50)
			this.rating='E';
		if(rating<50)
			this.rating='F';
		else
			rating='F';
	}
	
}
