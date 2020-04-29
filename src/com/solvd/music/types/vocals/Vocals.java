package music.types.vocals;

import music.types.WayOfExecution;

public class Vocals extends WayOfExecution {

	public String vocalist = "with music";

	public Vocals() {

	}

	public Vocals(int century, String era, String genre) {
		super(century, era, genre);
		this.vocalist = vocalist;
	}

	@Override
	public void printInfo() {
		System.out.println(century + "__" + era + "__" + genre + "__" + vocalist);
		

	}
}
