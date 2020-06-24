package adapter;

public class TheaterAdapter {
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
}
