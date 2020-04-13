package music.types.groups;

public enum ToolTypes {

	STRINGS("violin, guitar"), KEYBOARDS("piano, organ"), PERCUSSION("drums, bells");

	ToolTypes(String details) {
		this.details = details;

	}

	private String details = null;

	public String getDetails() {
		return this.details;
	}
}
