package Adapter;

public class Entertainer {
	private String name;
	private int age;
	private char rating;
	private int donation;
	public Entertainer(String name,int age,char rating,int donation){
		setName(name);
		setAge(age);
		setRating(rating);
		setDonation(donation);
		
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
	public void setRating(char rating) {
		if(rating>='A'&& rating<='F')
			this.rating=rating;
		else
			rating='F';
	}
	public int getDonation() {
		return donation;
	}
	public void setDonation(int donation) {
		if(donation > 999 && donation < 20001)
		{
			this.donation=donation;
		}
		else
			donation=1000;
	}
	
}
