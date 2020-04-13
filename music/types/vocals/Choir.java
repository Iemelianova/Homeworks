package music.types.vocals;

public class Choir extends Vocals {

	public String choirName = "defoult";

	public int singers = 4;

	public Choir() {

	}

	public Choir(int century, String era, String genre, int singers, String choirName) {
		super(century, era, genre);
		this.choirName = choirName;
		this.singers = singers;
	}

	public void printInfo() {

	}

	public final String arePerforming() {
		String singerss = Integer.toString(singers);
		String arePerforming = singerss + " singers and some music group";
		return arePerforming;

	}

}
