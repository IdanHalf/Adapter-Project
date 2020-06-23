package adapter;

public class Athlete {
	private String name;
	private int age;
	private double height;
	private int rating;
	public Athlete(String name,int age,double height,int rating){
		setName(name);
		setAge(age);
		setHeight(height);
		setRating(rating);	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.length()<2) {
			this.name="athlete";
			return;
		}
		for(int i=0;i<name.length();i++)
		{
			if(!(name.toLowerCase().charAt(i)>'a')&&(name.toLowerCase().charAt(i)>'z')) {
				this.name="athlete";
				return;
			}
		}
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>19&& age<35)
			this.age=age;
		else
			this.age=20;
			
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height>1.60&& height<2.1)
			this.height=height;
		else
			this.height=1.87;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		if(rating>=1&&rating<=100)
			this.rating=rating;
		else
			this.rating=50;
	}
	@Override
	public String toString() {
		return "Athlete [name=" + name + ", age=" + age + ", height=" + height + ", rating=" + rating + "]";
	}
	

}
