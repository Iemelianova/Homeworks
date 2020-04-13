package music.types.groups;
import music.types.Types;

public final class MusicGroups extends Types {
	
	public String groupName = "default";

	public MusicGroups() {

	}

	public MusicGroups(int century, String era, String genre, String groupName) {
		super(century, era, genre);
		this.groupName = groupName;
	}
	
	
	public void printInfo() {
		System.out.println("Century: " + century);
		System.out.println("Music era: " + era);
		System.out.println("Music genre: " + genre);
		System.out.println("Group name: " + groupName);

	}

}
