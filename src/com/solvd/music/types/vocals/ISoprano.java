package music.types.vocals;

public interface ISoprano {

	public boolean isSoprano = true;

	public default String getInfoMusic() {

		return "This composition is new!";
	}

}
