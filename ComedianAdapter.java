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

	public String getSpecial1() {
		return comedian.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(comedian.getSpecial2());
	}
}
