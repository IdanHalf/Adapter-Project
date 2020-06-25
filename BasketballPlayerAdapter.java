package adapter;

public class BasketballPlayerAdapter implements AllPlayerAdapter{
	BasketballPlayer basketballPlayer;
	public BasketballPlayerAdapter(BasketballPlayer newBasketball)
	{
		basketballPlayer = newBasketball;
	}
	public String getName() {
		return basketballPlayer.getName();
	}
	public String getAge() {
		return String.valueOf(basketballPlayer.getAge());
	}
	public String getHeight() {
		return String.valueOf(basketballPlayer.getHeight());
	}
	public String getRating() {
		return String.valueOf(basketballPlayer.getRating());
	}
	public String getDonation() {
		return String.valueOf(basketballPlayer.getDonation());
		}
	public String getSpecial1() {
		return basketballPlayer.getSpecial1();
	}
	public String getSpecial2() {
		return String.valueOf(basketballPlayer.getSpecial2());
	}
	public void print() {
		System.out.println("name="+getName()+" age="+getAge()+" height="+getHeight()+" rating="+getRating()+" trait1="+getSpecial1()+" trait2="+getSpecial2());	
	}
}
