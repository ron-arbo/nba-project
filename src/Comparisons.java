
public class Comparisons {

	//3ptO, 3ptD, 2ptO, 2ptD, rpg, apg
	/*
	Do matchup description displaying all stats at the beginning
	
	Say which team won each battle, use rng to slightly change numbers so same thing doesnt happen every time
	
	If one team overwhelmingly wins a stat, have them take advantage, better chance to win
	
	if a coach has a low defensive rating, use rng to determnine if superstar takeover happens,
	 greatly increases team chance of winning
	 */
	
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
	
	public team matchup(team team1, team team2) {
		//Should return a winner between two teams
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
