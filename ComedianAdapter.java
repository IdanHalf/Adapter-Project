package adapter;

public class ComedianAdapter implements AllPlayerAdapter{
	Comedian comedian;
	public ComedianAdapter(Comedian newComedian) {
		comedian=newComedian;
	}
	public String getName() {
		return comedian.getName();
	}

	public String getAge() {
		return String.valueOf(comedian.getAge());
	}

	public String getHeight() {
		return "N/A";
	}

	public String getRating() {
		return String.valueOf(comedian.getRating());
	}
	public String getDonation() {
		return String.valueOf(comedian.getDonation());
		}

	public String getSpecial1() {
		return comedian.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(comedian.getSpecial2());
	}
	public void print() {
		System.out.println("Hi i donated: "+getDonation()+"$ my name is: "+getName()+", i am "+getAge()+" years old, my height is "+getHeight()+", my rating is: "+getRating()+", im a comedian performing at: "+getSpecial1()+" and my signature joke is: "+getSpecial2());	
	}
}
