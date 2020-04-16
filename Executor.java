
import music.types.vocals.Acapella;

public class Executor {

	public static void main(String[] args) {

		AllLists lists = new AllLists();

		Acapella acapella = new Acapella(21, "80s", "pop");
		acapella.setSinger("duet");
		acapella.getSinger();
		lists.setMusicians(acapella);
		for (Object acapellas : lists.getlistOfMusicians()) {
			acapella.printInfo();
			System.out.println(acapella.getInfoMusic());
		}

	}
}
