package adapter;

public class Entertainer {
	private String name;
	private int age;
	private char rating;
	public Entertainer(String name,int age,char rating){
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
				if(!(name.toLowerCase().charAt(i)>'a')&&(name.toLowerCase().charAt(i)>'z'))
				{
					this.name="entertainer";
					return;
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
	public void setRating(char rating) {
		if(rating>='A'&& rating<='F')
			this.rating=rating;
		else
			rating='D';
	}
	
}
