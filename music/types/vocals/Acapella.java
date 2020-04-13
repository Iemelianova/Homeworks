package music.types.vocals;

public class Acapella extends Vocals implements ISoprano {

	private String singer = "solo";

	public Acapella() {

	}

	public Acapella(int century, String era, String genre) {
		super(century, era, genre);

	}

	public void setSinger(String value) {
		this.singer = value;

	}

	public String getSinger() {
		return this.singer;
	}

	public void printInfo() {

	}

}
