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
	public String getDonation() {
	return String.valueOf(soccerPlayer.getDonation());
	}

	public String getSpecial1() {
		return soccerPlayer.getSpecial1();
	}

	public String getSpecial2() {
		return String.valueOf(soccerPlayer.getSpecial2());
	}
	public void print() {
		System.out.println("Hi i donated: "+getDonation()+"$ my name is: "+getName()+", i am "+getAge()+" years old, my height is "+getHeight()+"m, my rating is: "+getRating()+", i play soccer for the: "+getSpecial1()+" and i can bounce the ball "+getSpecial2()+" times");	
	}
	

}
