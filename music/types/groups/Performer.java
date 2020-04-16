package music.types.groups;

import music.types.Types;

public class Performer extends Types {

	public String performerName = "default";

	public Performer() {

	}

	public Performer(int century, String era, String genre, String performerName) {
		super(century, era, genre);
		this.performerName = performerName;
	}

	@Override
	public void printInfo() {
		System.out.println("Century: " + century);
		System.out.println("Music era: " + era);
		System.out.println("Music genre: " + genre);
		System.out.println("Performer name: " + performerName);
	}

}
