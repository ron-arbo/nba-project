import java.util.ArrayList;
import java.util.List;

public class tournament {

	List<team> contenders;
	
	public tournament(List<team> contenders) {
		this.contenders = contenders;
	}
	
	//This method will take the given list of teams and return one half its size, containing the winners
	public List<team> playRound(List<team> players) {
		List<team> output = new ArrayList<team>();
		
		int i = 0;
		int j = players.size()-1;
		
		while(i < players.size()/2) {
			team team1 = players.get(i);
			team team2 = players.get(j);
			output.add(team1.matchup(team2, team1.getSupMap()));
			i++; j--;
		}
		
		if(output.size() == 1) {
			System.out.println();
			System.out.println("Congratulations to the " + output.get(0).getName() + ", they are your new NBA champions as declared by the simulator!");
		}
		else {
			System.out.println();
			System.out.print("This round has concluded! The winners are: ");
			for(int h = 0; h < output.size(); h++) {
				System.out.print(output.get(h).getName() + " ");
			}
			System.out.println();
			System.out.println();
		}
		
		return output;
	}
	
	public List<team> playAll(List<team> players){
		if(players.size() == 1) {
			return players;
		}
		else {
			return playAll(this.playRound(players));
		}
	}
	
}
