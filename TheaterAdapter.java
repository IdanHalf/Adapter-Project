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

	public String getSpecial1() {
		return actor.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(actor.getSpecial2());
	}
	public void print() {
		System.out.println("name="+getName()+" age="+getAge()+" height="+getHeight()+" rating="+getRating()+" trait1="+getSpecial1()+" trait2="+getSpecial2());	
	}
}
