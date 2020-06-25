package adapter;

import java.util.Random;

public class Main {
	public static String[] names= {"daniel","ron","idan","lior","itay","gal","tamir","dudy","dima","ira","yosie","artyom","dor","alex","josh","mor","priel","ross","michel","dani","maten","matt","yegor","sivan","samiun","nati","rotam","liza","natash","yura","kuruki","kukuri","mohammad","igal","orian","yafit","ofer","ofrie","rachel","shoval"};
	public static String[] teams= {"Air Ballers","The Thunder","Ankle Breakers","Ball Hoggers","Ball Stealers ","Baller Goons","Basket Hounds","Basket Junkies","Bear Dribblers ","Bombers ","Born Ballers ","Chargers","Collision Course ","Court Rulers","Defenders","Dunkalicious ","Fast Breakers","Fast Movers","Fire Ballers","Flight Time","Flying Ballers ","Gravity Defiers ","Head Bangers","Heart Stoppers ","Hoop Breakers","Hoop Penetrators","Hoopers ","Hoopsters ","Impossible Shots","In Style","Jedi Ballers","Jumpshot Hustlers","LeBrontourage ","Lowriders","Monster Squad","Neck Breakers","Net Ragers","Net Rippers ","Netty Shots","No Sympathy"};
	public static String[] stages= {"Corona Theatre","Eglinton Theatre","Garneau Theatre","Rex Theatre","Royal Cinema"," Imatra","Tennispalatsi","L'Arlequin","Le Balzac","Le Champo","La Geode","mobile cinema","Babylon","Kino International","Teatro Adriano","Teatro Dante","Melkweg","PandaVision","Rialto","Phoenix Cinema","London IMAX","Kingstanding"," Odeon","Safari Cinema","Savoy Theatre","Artcraft Theatre","Toneelschuur","Tuschinski","Atlantic","Astoria","Bergakungen","Cosmonova","Draken","Gota Lejon","Maximteatern","Lewisham Odeon"};
	public static String[] quotes={"Time flows constantly it doesnt care about the people who are struggling","All those moments will be lost in time like tears in rain","Ill be back","Of all the gin joints in all the towns in all the world she walks into mine","Bond James Bond","Frankly my dear I don't give a damn","Well its not the men in your life that counts its the life in your men","When will the war end? When someone wins","My Mama always said Life was like a box of chocolates you never know what youre gonna get","Dobby is free","Love means never having to say youre sorry","Youre gonna need a bigger boat","May the Force be with you","Im going to make him an offer he cant refuse","You talkin to me?","The first rule of Fight Club is You do not talk about Fight Club","I solemnly swear I am up to no good","I am your father","Hello My name is Inigo Montoya You killed my father Prepare to die","Why so serious?","Ill be back","Yippie ki yay motherf er","Houston we have a problem","Heres Johnny","Say hello to my little friend","Youve got to ask yourself one question Do I feel lucky? Well do ya punk?","Wait A Minute Doc Are You Telling Me You Built A Time Machine   Out Of A DeLorean?","Great Scott","Numbing the pain for a while will make it worse when you finally feel it","It does not do to dwell on dreams and forget to live","Keep your friends close  but your enemies closer","Mama says   Stupid is as stupid does","Im having an old friend for dinner","Hasta la vista  baby","if nobody cares to accept you and wants you in this world accept yourself and you will see that you dont need them and their selfish ideas","The ticket to the future is always open","Life is not a game of luck If you wanna win work hard","Power comes in response to a need not a desire You have to create that need","If you dont like your destiny don’t accept it Instead have the courage to change it the way you want it to be","To defeat evil  I shall become an even GREATER evil"};
	public static String[] jokes= {"Why does a dog wag it's tail? No one else will do it for them","Knock Knock Who's there ? Cabot ? Cabot who ? Cabotret ","A jaguar asked an colourful arsehole with a big nose to join him in hide and seek toucan play that game","What's the difference between a blonde and a telephone? It costs 30 cents to use a telephone","Why aren't there any Knock, Knock jokes about America? Cuz freedom rings baby","How many blonde jokes are there? One the rest are facts","Who's there? YOUR MOM'S VAGINAL","Knock Knock Whos there Beryl Beryl who ? Beryl of beer ","Who ever invented Knock, Knock Jokes should win the No bell Prize","As Dumbledore stood there stroking his wand Harry regretted transferring to Catholic School","Whats Shakespeares favorite video game? Sonnet the hedgehog","Knock KnockWhos there Tarzan Tarzan who? Tarzan stripes forever","Knock KnockWhos there?CecileCecile who?Cecile this envelope"," How can you tell that a blonde sent you a fax? It has a stamp on it","I remember when my dad was cutting onions and our whole family was crying poor onions he was such a good dog","Why did the octopus blush? He’d just seen the bottom of the ocean","How do you know that a blondes been on the computer using Microsoft Word?","Theres White out all over the screen","A human fart can be louder than a trombone I discovered that at my daughters school concert","My chemistry teacher said we were going to use burners today I asked if I could just play my mixtape instead","Knock KnockWhos there Lauren Lauren who Lauren order","Why did the chicken cross the road The answer is trivial and is left as an exercise for the reader","What is the difference between a rebel base and a Pakistan school I don't know I'm just a drone pilot","What do you mean the school must be haunted ? Daughter Well the principal kept going on about the school spirit ","Knock KnockWhos there Hepburn Hepburn who Hepburn and indigestion","Why did the chicken cross the road? To get to the other COCK"," Why don't blondes make good pharmacists?They can't get the bottle into the typewriter","What did the existential pig say? What ham ?","Witherspoon? No with a knife","Why did the genie turn the man into a toad? He rubbed him the wrong way","You know you're texting too much when you try to text, but you're on a landline","What happened to the frog parked in a handicap spot? He go toad ","What is the mating call of a blonde? Im drunk","Knock KnockWhos there? Maine Maine who? Maine I come in now please","How do you get over a crush you've had since high school? Leave the dungeon door unlocked","Knock Knock Whos there Amin Amin who ? Amin man","Why don't you hear any knock knock jokes about America? Because freedom rings","What do tourists pay guides to do at the grand canyon To let them mount their ass and ride in the crack","Knock Knock Whos there Benny Bennny who ? Benny thing happening ","Knock KnockWhos there? Castro Castro who? Castro bread upon the waters"};

	public static void main(String[] args) {
		Random generate=new Random();
		AllPlayerAdapter [] donators=new AllPlayerAdapter[10];
		int i=0;
		while(i<10)
		{
			int num=(generate.nextInt(6)+1);
			if(num==1)
			{
				donators[i]=new SoccerPlayerAdapter(new SoccerPlayer(names[generate.nextInt(names.length)], generate.nextInt(), (generate.nextDouble()+1), (generate.nextInt(100)+1), (generate.nextInt(20000)+1000), teams[generate.nextInt(teams.length)], generate.nextInt()));
				i++;
			}
			else if(num==2)
			{
				donators[i]=new GoalKeeperAdapter(new GoalKeeper(names[generate.nextInt(names.length)], generate.nextInt(), (generate.nextDouble()+1), (generate.nextInt(100)+1), (generate.nextInt(20000)+1000), teams[generate.nextInt(teams.length)], generate.nextInt()));
				i++;
			}
			else if(num==3)
			{
				donators[i]=new BasketballPlayerAdapter(new BasketballPlayer(names[generate.nextInt(names.length)], generate.nextInt(), (generate.nextDouble()+1), (generate.nextInt(100)+1), (generate.nextInt(20000)+1000), teams[generate.nextInt(teams.length)], generate.nextBoolean()));
				i++;
			}
			else if(num==4)
			{
				donators[i]=new TheaterAdapter(new Theater(names[generate.nextInt(names.length)], generate.nextInt(), (generate.nextInt(100)+1),(generate.nextInt(20000)+1000), stages[generate.nextInt(stages.length)],quotes[generate.nextInt(quotes.length)]) );
				i++;
			}
			else if(num==5)
			{
				donators[i]=new ComedianAdapter(new Comedian(names[generate.nextInt(names.length)], generate.nextInt(), (generate.nextInt(100)+1), (generate.nextInt(20000)+1000), stages[generate.nextInt(stages.length)],jokes[generate.nextInt(jokes.length)] ));
				i++;
			}
		}
		for(i=0;i<donators.length;i++)
			donators[i].print();
	}
}
