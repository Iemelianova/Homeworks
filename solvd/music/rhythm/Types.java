package music.rhythm;

public class Types extends Rhythm {

	public String genre = "opera";

	public Types() {

	}

	public Types(int century, String era, String kind, String genre) {
		super(century, era, kind);
		this.genre = genre;

	}

	public void printInfo() {

	}
}
