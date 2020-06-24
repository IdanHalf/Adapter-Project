package Adapter;

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
	public String getSpecial1() {
		return basketballPlayer.getSpecial1();
	}
	public String getSpecial2() {
		return String.valueOf(basketballPlayer.getSpecial2());
	}
}
