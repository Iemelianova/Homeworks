package music.types;

import music.MusicEras;

public class Types extends MusicEras {

	public String genre = "opera";

	public Types() {

	}

	public Types(int century, String era, String genre) {
		super(century, era);
		this.genre = genre;
	}

	public void printInfo() {
		
	}
}
