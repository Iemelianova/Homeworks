package music.types.vocals;

public class Acapella extends Vocals implements ISoprano {

	private String singer = "solo";

	public Acapella() {

	}

	public Acapella(int century, String era, String genre) {
		super(century, era, genre);

	}

	public void setSinger(String singer) {
		this.singer = singer;

	}

	public String getSinger() {
		return this.singer;
	}

	@Override
	public void printInfo() {
		System.out.println(century + "__" + era + "__" + genre + "__" + singer);
	}

}
