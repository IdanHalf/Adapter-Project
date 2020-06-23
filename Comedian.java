package adapter;

public class Comedian extends Entertainer{
	private String stage;
	private String joke;
	public Comedian(String name,int age,char rating,String stage,String joke)
	{
		super(name, age, rating);
		setName(name);
		setAge(age);
		setRating(rating);
		setStage(stage);
		setJoke(joke);
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		if(stage.length()<2) {
			this.stage="Heichal tarbot";
			return;
		}
		for(int i=0;i<stage.length();i++)
			if(stage.toLowerCase().charAt(i)>'a'||stage.toLowerCase().charAt(i)<'z')
			{
				this.stage="Heichal tarbot";
				return;
			}
		this.stage=stage;
		
	}
	public String getJoke() {
		return joke;
	}
	public void setJoke(String joke) {
		if(joke.length()<5) {
			this.joke="What's the best thing about Switzerland? I don't know, but the flag is a big plus.";
			return;
		}
		for(int i=0;i<stage.length();i++)
			if(joke.toLowerCase().charAt(i)>'a'||joke.toLowerCase().charAt(i)<'z')
			{
				this.joke="What's the best thing about Switzerland? I don't know, but the flag is a big plus.";
				return;
			}
		this.joke=joke;
	}

}
