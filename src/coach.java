
public class coach {

	String name;
	int OffRating;
	int DefRating;

	public coach(String name, int OffRating, int DefRating) {
		this.name = name;
		this.OffRating = OffRating;
		this.DefRating = DefRating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOffRating() {
		return OffRating;
	}

	public void setOffRating(int offRating) {
		OffRating = offRating;
	}

	public int getDefRating() {
		return DefRating;
	}

	public void setDefRating(int defRating) {
		DefRating = defRating;
	}
	
	
}
