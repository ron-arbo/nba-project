import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class team implements Comparable<team>{

	String name;
	int year;
	coach coach;
	double threeptO;
	double threeptD;
	double twoptO;
	double twoptD;
	double rpg;
	double apg;
	boolean superstar;
	public Map<team, String> superstarMap = new HashMap<team, String>();
	public Map<team, String> previewMap = new HashMap<team, String>();
	
	
	

	
	public team(String name, int year, coach coach, double threeptO, double threeptD, 
			double twoptO, double twoptD, double rpg, double apg, boolean superstar){
		this.name = name;
		this.year = year;
		this.coach = coach;
		this.threeptO = threeptO;
		this.threeptD = threeptD;
		this.twoptD = twoptD;
		this.twoptO = twoptO;
		this.rpg = rpg;
		this.apg = apg;
		this.superstar = superstar;
	}
	
	public Map<team, String> getSupMap(){
		return superstarMap;
	}
	
	public double getThreeptO() {
		return threeptO;
	}


	public void setThreeptO(double threeptO) {
		this.threeptO = threeptO;
	}


	public double getThreeptD() {
		return threeptD;
	}


	public void setThreeptD(double threeptD) {
		this.threeptD = threeptD;
	}


	public double getTwoptO() {
		return twoptO;
	}


	public void setTwoptO(double twoptO) {
		this.twoptO = twoptO;
	}


	public double getTwoptD() {
		return twoptD;
	}

	public void setTwoptD(double twoptD) {
		this.twoptD = twoptD;
	}
	
	public double getRpg() {
		return rpg;
	}

	public void setRpg(double rpg) {
		this.rpg = rpg;
	}

	public double getApg() {
		return apg;
	}

	public void setApg(double apg) {
		this.apg = apg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public coach getCoach() {
		return coach;
	}

	public void setCoach(coach coach) {
		this.coach = coach;
	}
	
	public boolean getSuperstar(team team) {
		return team.superstar;
	}
	
	
	public int SuperstarTakeover(team team2, Map<team, String> inputMap) {
		
		boolean superstar1 = false;
		boolean superstar2 = false;
		
		if(getSuperstar(this)) {
			
			if(team2.getCoach().getDefRating() < 85) {
				double rand = (int)(Math.random()*101);
				if(rand < 25) {
					superstar1 = true;
				}
			}
		}
		
		if(getSuperstar(team2)) {
			
			if(this.getCoach().getDefRating() < 85) {
				double rand2 = (int)(Math.random()*101);
				if(rand2 < 25) {
					superstar1 = true;
				}
			}
		}
		
		if(superstar1 != true && superstar2 == true) {
			System.out.println("Looks like the " + this.getName() + "'s superstar, " + 
				inputMap.get(this) + " has taken over the game! "
						+ "This greatly increases his team's chance of winning!");
			return 25;
		}
		else if(superstar1 == true && superstar2 != true) {
			System.out.println("Looks like the " + team2.getName() + "'s superstar, " + 
				inputMap.get(team2) + " has taken over the game! This greatly increases his team's chance of winning!");
			return -25;
		}
		else if(superstar1 == true && superstar2 == true) {
			System.out.println("Wow! Both teams' superstars, " + inputMap.get(this) + " and " +
		inputMap.get(team2) + " are going off. Unfortunately their effects cancel.");
			return 0;
		}
	
	return 0;
	}
	
	public void gametime(team otherTeam, Map<team, String> inputMap, Map<team, String> supMap) {
		
		team team1 = this;
		team team2 = otherTeam;
		
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Welcome to an NBA showcase between the " + team1.getName() + 
				" and the " + team2.getName() + ". Press P to preview these teams' impending matchup. Press M to simulate their matchup! Or, press X to exit.");
		
		String input = scan.next();
		
		if(input.equals("P") || input.equals("p")) {
			team1.matchupPreview(team2, inputMap, supMap);
		}
		
		if(input.equals("M") || input.equals("m")) {
			team1.matchup(team2, supMap);
		}
		
		if(input.equals("X") || input.equals("x")) {
			System.out.println("Application Closed");
			scan.close();
		}
		
	}
	
	public void matchupPreview(team otherTeam, Map<team, String> inputMap, Map<team, String> supMap) {
		
		System.out.println("This should be an enticing matchup. " + "\n" + inputMap.get(this) + "\n" + inputMap.get(otherTeam));
		System.out.println("Here's a breakdown of the teams' regular season statistics:");
		
		System.out.println(this.getName() + ":");
		System.out.println("Three point percentage: " + this.getThreeptO());
		System.out.println("Opponent's three point percentage: " + this.getThreeptD());
		System.out.println("Two point percentage: " + this.getTwoptO());
		System.out.println("Opponent's two point percentage: " + this.getTwoptD());
		System.out.println("Assists per game: " + this.getApg());
		System.out.println("Rebounds per game " + this.getRpg());
		
		System.out.println(otherTeam.getName() + ":");
		System.out.println("Three point percentage: " + otherTeam.getThreeptO());
		System.out.println("Opponent's three point percentage: " + otherTeam.getThreeptD());
		System.out.println("Two point percentage: " + otherTeam.getTwoptO());
		System.out.println("Opponent's two point percentage: " + otherTeam.getTwoptD());
		System.out.println("Assists per game: " + otherTeam.getApg());
		System.out.println("Rebounds per game " + otherTeam.getRpg());
		
		System.out.println("Press 'M' to simulate this matchup!");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		if(input.equals("M")) {
			this.matchup(otherTeam, supMap);
		}
		scanner.close();
		
	}
	
	public team matchup(team otherTeam, Map<team, String> superstar) {
		
		/* NOTE: Adjust multiplied numbers to more accurately represent possible points added
		 * to possibly create a final score. ALSO Remember to factor in superstar takeover effects
		 * also add coaching battles
		 */
		
		//Note: The numbers are way off, warriors tend to beat bucks by 125+ each time, make it closer
		
		System.out.println("The following is a simulation of the matchup between two NBA teams using their regular season statstics as a basis for their expected performance.");
		
		//team representing a tie
		team neither = new team("Neither", 0, null, 0, 0, 0, 0, 0, 0, false);
		
		double team1Sum = 0.0;
		double team2Sum = 0.0;
		
		//Gotta make a default case in case teams tie
		team threept = neither;
		team twopt = neither;
		team reb = neither;
		team ast = neither;
		team winner = neither;
		team coach = neither;
	
		Random rand = new Random();
		
		/*-------------------------------------three point battle------------------------------*/
		team1Sum += (((double)(rand.nextInt(6) + 10)/10.0) * (this.getThreeptO() - this.getThreeptD()));
		team2Sum += (((double)(rand.nextInt(6) + 10)/10.0) * (otherTeam.getThreeptO() - otherTeam.getThreeptD()));
		if(team1Sum > team2Sum) {
			System.out.println("The " + this.getName() + " have won the three point battle!");
			threept = this;
		}
		if(team1Sum < team2Sum) {
			System.out.println("The " + otherTeam.getName() + " have won the three point battle!");
			threept = otherTeam;
		}
		if(team1Sum == team2Sum) {
			System.out.println("Wow! The two teams have an exactly equal three point performance, should be a tight one!");
			threept = neither;
		}
		/*-------------------------------------three point battle------------------------------*/
		
		
		/*-------------------------------------two point battle------------------------------*/
		double team12 = (((double)(rand.nextInt(6) + 10)/10.0) * (this.getTwoptO() - this.getTwoptD()));
		double team22 = (((double)(rand.nextInt(6) + 10)/10.0) * (otherTeam.getTwoptO() - otherTeam.getTwoptD()));
		
		if(team12 > team22) {
			System.out.println("The " + this.getName() + " have won the two point battle!");
			twopt = this;
		}
		if(team12 < team22) {
			System.out.println("The " + otherTeam.getName() + " have won the two point battle!");
			twopt = otherTeam;
		}
		if(team12 == team22) {
			System.out.println("Wow! The two teams have an exactly equal two point performance, should be a tight one!");
			twopt = neither;
		}
		/*-------------------------------------two point battle------------------------------*/
		
		team1Sum += team12;
		team2Sum += team22;
		
		/*-------------------------------------rebounding battle------------------------------*/
		double team1Reb = (((double)(rand.nextInt(6) + 10)/10.0) * (this.getRpg()));
		double team2Reb = (((double)(rand.nextInt(6) + 10)/10.0) * (otherTeam.getRpg()));
		
		if(team1Reb > team2Reb) {
			System.out.println("The " + this.getName() + " have won the rebounding battle!");
			reb = this;
		}
		if(team1Reb < team2Reb) {
			System.out.println("The " + otherTeam.getName() + " have won the rebounding battle!");
			reb = otherTeam;
		}
		if(team1Reb == team2Reb) {
			System.out.println("Wow! The two teams have an exactly equal rebounding performance, should be a tight one!");
			reb = neither;
		}
		/*-------------------------------------rebounding battle------------------------------*/
		
		team1Sum += team1Reb;
		team2Sum += team2Reb;
		
		/*-------------------------------------assisting battle------------------------------*/
		double team1Ast = (((double)(rand.nextInt(6) + 10)/10.0) * (this.getApg()));
		double team2Ast = (((double)(rand.nextInt(6) + 10)/10.0) * (otherTeam.getApg()));
		
		if(team1Ast > team2Ast) {
			System.out.println("The " + this.getName() + " have won the assisting battle!");
			ast = this;
		}
		if(team1Ast < team2Ast) {
			System.out.println("The " + otherTeam.getName() + " have won the assisting battle!");
			ast = otherTeam;
		}
		if(team1Ast == team2Ast) {
			System.out.println("Wow! The two teams have an exactly equal assisting performance, should be a tight one!");
			ast = neither;
		}
		/*-------------------------------------assisting battle------------------------------*/
		
		team1Sum += team1Ast;
		team2Sum += team2Ast;
		
		/*-----------------------------------coaching battle---------------------------------*/
		double team1C = (((double)(rand.nextInt(4) + 10)/10.0) * (this.getCoach().getOffRating()));
		team1C += (((double)(rand.nextInt(4) + 10)/10.0) * (this.getCoach().getDefRating()));
		double team2C = (((double)(rand.nextInt(4) + 10)/10.0) * (otherTeam.getCoach().getOffRating()));
		team2C += (((double)(rand.nextInt(4) + 10)/10.0) * (otherTeam.getCoach().getDefRating()));
		
		if(team1C > team2C) {
			System.out.println("The " + this.getName() + " have won the coaching battle!");
			coach = this;
		}
		if(team1C < team2C) {
			System.out.println("The " + otherTeam.getName() + " have won the coaching battle");
			coach = otherTeam;
		}
		if(team1C == team2C) {
			System.out.println("These coaches are equal, negating their effects");
			coach = neither;
		}
		/*---------------------------------coaching battle-----------------------------------*/
		
		team1Sum += team1C;
		team2Sum += team2C;
		
		team1Sum+= this.SuperstarTakeover(otherTeam, superstar);
		
		if(team1Sum > team2Sum) {
			System.out.println("The " + this.getName() + " have won the game");
			winner = this;
		}
		if(team1Sum < team2Sum) {
			System.out.println("The " + otherTeam.getName() + " have won the game");
			winner = otherTeam;
		}
		
		System.out.println("Here's how the battles played out:");
		System.out.println("Three point shooting: " + threept.getName());
		System.out.println("Two point shooting: " + twopt.getName());
		System.out.println("Rebounding: " + reb.getName());
		System.out.println("Assisting: " + ast.getName());
		System.out.println("Coaching: " + coach.getName());
		
		return winner;
	}
	
	public boolean equals(team input) {
		if(this.name.equals(this.name)) {
			return true;
		}
		return false;
	}
	
	
	//Will run through a seven game series and determine a winner
	@Override
	public int compareTo(team team1) {
		
		int thisWins = 0;
		int inputWins = 0;
		int count = 0;
		
		while(count <=7) {
			if(this.equals(this.matchup(team1, superstarMap))){
				thisWins++;
			}
			if(team1.equals(this.matchup(team1, superstarMap))){
				inputWins++;
			}
			count++;	
		}
		
		if(thisWins > inputWins) {
			return 1;
		}
		if(inputWins > thisWins) {
			return -1;
		}
		return 0;
	}

	public List<team> AssignSeed(List<team> input){
		List<team> finalList = input;
		Collections.sort(finalList);
		
		return finalList;
	}

}
