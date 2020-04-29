package music;

public abstract class MusicEras {

	public int century = 20;
	public String era = "80s";

	public MusicEras() {

	}

	public MusicEras(int century, String era) {
		this.century = century;
		this.era = era;
	}

	public void printInfo() {
		System.out.println(century + "__" + era);

	}
}
