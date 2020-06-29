package adapter;

public class TheaterAdapter implements AllPlayerAdapter {
	Theater actor;
	public TheaterAdapter(Theater newActor) {
		actor=newActor;
	}
	public String getName() {
		return actor.getName();
	}

	public String getAge() {
		return String.valueOf(actor.getAge());
	}

	public String getHeight() {
		return "N/A";
	}

	public String getRating() {
		return String.valueOf(actor.getRating());
	}
	public String getDonation() {
		return String.valueOf(actor.getDonation());
		}

	public String getSpecial1() {
		return actor.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(actor.getSpecial2());
	}
	public void print() {
		System.out.println("Hi i donated: "+getDonation()+"$ my name is: "+getName()+", i am "+getAge()+" years old, my height is "+getHeight()+", my rating is: "+getRating()+", im an actor at: "+getSpecial1()+" and my quote is: "+getSpecial2());	
	}
}
