import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class NBADriver {
	
	public static void main(String[] args) {
		
		
		coach BradStevens = new coach("Brad Stevens", 96, 99);
		team Celtics2018 = new team("Celtics", 2018, BradStevens, 37.7, 33.9, 49.1, 48.8, 44.5, 22.5, false);
		
		coach SteveKerr = new coach("Steve Kerr", 94, 90);
		team Warriors2018 = new team("Warriors", 2018, SteveKerr, 39.1, 35.7, 56.0, 49.0, 43.5, 29.3, true);
		
		coach MikeDantoni = new coach("Mike D'Antoni", 99, 90);
		team Rockets2018 = new team("Rockets", 2018, MikeDantoni, 36.2, 35.1, 55.8, 51.9, 43.5, 21.5, true);
		
		coach DwyaneCasey = new coach("Dwyane Casey", 85, 77);
		team Raptors2018 = new team("Raptors", 2018, DwyaneCasey, 35.8, 35.7, 54.1, 48.6, 44.0, 24.3, false);
		
		coach BrettBrown = new coach("Brett Brown", 80, 80);
		team Sixers2018 = new team("76ers", 2018, BrettBrown, 36.9, 34.2, 52.6, 48.2, 47.4, 27.1, false);
		
		coach TyronnLue = new coach("Tyronn Lue", 70, 75);
		team Cavs2018 = new team("Cavaliers", 2018, TyronnLue, 37.2, 36.8, 54.0, 53.3, 42.1, 23.4, true);
		
		coach TerryStotts = new coach("Terry Stotts", 80, 75);
		team Blazers2018 = new team("TrailBlazers", 2018, TerryStotts, 36.6, 36.4, 49.3, 48.4, 45.5, 19.5, false);
		//low assists
		
		coach JoePrunty = new coach("Joe Prunty", 40, 45);
		team Bucks2018 = new team("Bucks", 2018, JoePrunty, 35.5, 37.2, 53.1, 51.3, 39.8, 23.8, true);
		//low reb
		
		coach NateMcMillan = new coach("Nate McMillan", 80, 80);
		team Pacers2018 = new team("Pacers", 2018, NateMcMillan, 36.9, 34.9, 51.3, 53.0, 42.3, 22.2, false);
		
		coach AlvinGentry = new coach("Alvin Gentry", 70, 70);
		team Pelicans2018 = new team("Pelicans", 2018, AlvinGentry, 36.2, 35.5, 54.0, 50.3, 44.3, 26.8, true);
		
		coach ScottBrooks = new coach("Scott Brooks", 80, 65);
		team Wizards2018 = new team("Wizards", 2018, ScottBrooks, 37.5, 34.9, 50.8, 52.2, 43.1, 25.2, false);
		
		coach ErikSpoelstra = new coach("Erik Spoelstra", 90, 85);
		team Heat2018 = new team("Heat", 2018, ErikSpoelstra, 36.0, 36.0, 50.8, 49.1, 43.1, 22.7, false);
		
		coach QuinSnyder = new coach("Quin Snyder", 85, 85);
		team Jazz2018 = new team("Jazz", 2018, QuinSnyder, 36.6, 36.5, 51.5, 48.8, 43.3, 22.4, false);
		
		coach BillyDonovan = new coach("Billy Donovan", 75, 75);
		team Thunder2018 = new team("Thunder", 2018, BillyDonovan, 35.4, 36.7, 50.5, 51.1, 45.1, 21.3, true);
		
		coach TomThibodeau = new coach("Tom Thibodeau", 75, 80);
		team Timberwolves2018 = new team("TimberWolves", 2018, TomThibodeau, 35.7, 36.6, 51.9, 53.4, 42.0, 22.7, false);
		
		coach GreggPopovich = new coach("Gregg Popovich", 96, 95);
		team Spurs2018 = new team("Spurs", 2018, GreggPopovich, 35.2, 34.8, 49.9, 50.1, 44.2, 22.8, false);
		
		Map<team, String> superstarMap = new HashMap<team, String>();
		superstarMap.put(Bucks2018, "Giannis Antetokounmpo");
		superstarMap.put(Pelicans2018, "Anthony Davis");
		superstarMap.put(Rockets2018, "James Harden");
		superstarMap.put(Cavs2018, "LeBron James");
		superstarMap.put(Thunder2018, "Russell Westbrook");
		superstarMap.put(Warriors2018, "Kevin Durant or Steph Curry");
		
		Map<team, String> previewMap = new HashMap<team, String>();
		previewMap.put(Celtics2018, "The Celtics are a largely defensive-minded team led by genius coach Brad Stevens. Their talented youth and seemingly limitless potential make them a championship contender year in and year out.");
		previewMap.put(Warriors2018, "The Warriors are the pinnacle of success in the NBA. Their superteam roster and talented coaching make them an almost unstoppable force in a league with dwindling parity.");
		previewMap.put(Rockets2018, "The Rockets are an offensive minded team due to the ideals of their coach, Mike D’Antoni. They take more threes than anybody in the league and their MVP candidate all star James Harden acts as the perfect catalyst for this type of attack.");
		previewMap.put(Bucks2018, "The Bucks have one glowing aspect to their franchise, their Greek star Giannis Antetokounmpo. This young talent is stepping up and consistently carrying this team through poor coaching and management. His impact cannot be stressed enough.");
		previewMap.put(Sixers2018, "This team has been tanking for the past 5 years in hopes to bring in enough young talent to contend for a championship. Their second round demise to the far superior Celtics and immediate dismissal of their GM for misconduct may put a damper on their so beloved  “process”.");
		previewMap.put(Thunder2018, "The Thunder rely on the offensive talents of their “Big 3” in Russell Westbrook, Paul George, and Carmelo Anthony. While Westbrook is a stat-stuffer like no other his inefficiency and Anthony’s shortcomings put the Thunder in a tough position to contend in a loaded Western Conference.");
		previewMap.put(Timberwolves2018, "The Timberwolves have a pretty good amount of talent on their team. However, sub-par coaching and an injury plagued star in Jimmy Butler severely hurt their chances of being anything more than a second round team. ");
		previewMap.put(Jazz2018, "This year’s Jazz team was quite the surprise. After all-star Gordon Hayward left the team, electric rookie Donovan Mitchell emerged as an impressive talent, while role players such as Joe Ingles have stepped up to assume larger roles in the team’s success.");
		previewMap.put(Heat2018, "The Heat, after losing their arguably best player in Dion Waiters, are essentially a team of above average role players. They had no all stars this year but performed just well enough to snag the 8th seed in the East.");
		previewMap.put(Wizards2018, "Once a major threat to take over the East, the Wizards disappointed this year after losing all star point guard John Wall to injury for much of this season. This lead to the outburst in production by fellow guard Bradley Beal. When Wall is fully healthy this team can be very dangerous.");
		previewMap.put(Pelicans2018, "The Pelicans have one of the best talents in the NBA in Anthony Davis, and they also recently added center Demarcus Cousins to form a truly intimidating front court. Their guard duo of Rajon Rondo and Jrue Holiday give them strong passing and scoring presences as well, making this team very capable of taking down very talented rosters.");
		previewMap.put(Pacers2018, "Similarly to the Jazz, the Pacers exceeded expectations constantly this year as former role player Victor Oladipo emerged as an all NBA talent while not being hindered by former teammate Russell Westbrook. Their role players do their jobs very well so when Oladipo is hitting shots they can be hard to stop.");
		previewMap.put(Cavs2018, "The Cavaliers have a below average roster and a below average coach, however each and every year they are carried by the best player of his generation, Lebron James. Lebron can do it all, and without him the Cavs would be nothing, however he always gives them a shot");
		previewMap.put(Blazers2018, "The TrailBlazers are lead by their superstar duo of guards, Damian Lillard and C.J. McCollum. These two are lethal shooters and can almost score at will, making the Blazers a consistent threat.");
		previewMap.put(Spurs2018, "The Spurs have a decent roster led by an outstanding coach and good leadership. What they lack in talent they make up for in intangibles");
		previewMap.put(Raptors2018, "The Raptors are led by their guard duo of Kyle Lowry and Demar Derozan. Both are incredible allaround players whose chemistry has continued to grow and help the team throughout the years.");
		
		ArrayList<team> playoffs = new ArrayList<team>();
		playoffs.add(Timberwolves2018);
		playoffs.add(Thunder2018);
		playoffs.add(Heat2018);
		playoffs.add(Pelicans2018);
		playoffs.add(Pacers2018);
		playoffs.add(Blazers2018);
		playoffs.add(Sixers2018);
		playoffs.add(Rockets2018);
		playoffs.add(Celtics2018);
		playoffs.add(Spurs2018);
		playoffs.add(Jazz2018);
		playoffs.add(Wizards2018);
		playoffs.add(Bucks2018);
		playoffs.add(Cavs2018);
		playoffs.add(Raptors2018);
		playoffs.add(Warriors2018);
		
		//Warriors2018.gametime(Bucks2018, previewMap, superstarMap);
		
		tournament test = new tournament(playoffs);
		test.playAll(test.contenders);
		
	}
}
