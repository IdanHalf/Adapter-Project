package adapter;

public class SoccerPlayerAdapter implements AllPlayerAdapter{
	SoccerPlayer soccerPlayer;
	public SoccerPlayerAdapter(SoccerPlayer newSoccerPlayer)
	{
		soccerPlayer=newSoccerPlayer;
	}
	public String getName() {
		return soccerPlayer.getName();
	}

	public String getAge() {
		return String.valueOf(soccerPlayer.getAge());
	}

	public String getHeight() {
		return String.valueOf(soccerPlayer.getHeight());
	}

	public String getRating() {
		return String.valueOf(soccerPlayer.getRating());
	}

	public String getSpecial1() {
		return soccerPlayer.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(soccerPlayer.getSpecial2());
	}

}