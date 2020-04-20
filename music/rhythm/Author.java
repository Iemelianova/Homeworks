package music.rhythm;


public class Author extends Rhythm {

	public String composer = "Edvard Greig";

	public Author() {

	}

	public Author(int century, String era, String kind, String composer) {
		super(century, era, kind);
		this.composer = composer;
	}

	public void printInfo() {
		System.out.println("Century: " + century);
		System.out.println("Music era: " + era);
		System.out.println("Kind of music: " + kind);
		System.out.println("Composer: " + composer);
		
		
	}
}
