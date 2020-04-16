package music.rhythm;

import music.MusicEras;

public class Rhythm extends MusicEras {

	public String kind = "minor";

	public Rhythm() {

	}

	public Rhythm(int century, String era, String kind) {
		super(century, era);
		this.kind = kind;
	}

	public void printInfo() {
		
		
	}
}
