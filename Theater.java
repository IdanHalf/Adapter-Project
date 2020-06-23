package adapter;

public class Theater extends Entertainer{
	private String theater;
	private String quote;
	public Theater(String name,int age,char rating,String theater,String quote)
	{
		super(name, age, rating);
		setName(name);
		setAge(age);
		setRating(rating);
		setTheater(theater);
		setQuote(quote);
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater1) {
		if(theater1.length()<5) {
			theater ="Habima";
			return;
		}
		for(int i=0;i<theater.length();i++)
			if(!(theater1.toLowerCase().charAt(i)>'a'&&theater1.toLowerCase().charAt(i)<'z')){
				theater ="Habima";
				return;
			}
		theater=theater1;
		
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote1) {
		if(quote1.length()<5) {
			quote="one does not simply walk into mordor";
			return;
		}
		for(int i=0;i<quote1.length();i++)
			if((quote1.charAt(i)<'a'||quote1.charAt(i)>'z')&&(quote1.charAt(i)<'A'||quote1.charAt(i)<'Z')) {
				quote="one does not simply walk into mordor";
				return;
			}
		quote=quote1;
	}
	
}
