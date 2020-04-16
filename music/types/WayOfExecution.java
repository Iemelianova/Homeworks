package music.types;

public class WayOfExecution extends Types {

	private String way = "instrumental";

	public WayOfExecution() {

	}

	public WayOfExecution(int century, String era, String genre) {
		super(century, era, genre);

	}

	public void setWay(String way) {
		this.way = way;

	}

	public String getWay() {
		return this.way;
	}

}
