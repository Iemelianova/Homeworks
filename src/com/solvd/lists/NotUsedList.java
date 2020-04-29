package lists;

import java.util.ArrayList;
import java.util.List;

import music.MusicEras;

public class NotUsedList {

	List<? super MusicEras> listOfMusicians;

	public NotUsedList() {

		listOfMusicians = new ArrayList<MusicEras>();

	}

	public void setMusicians(MusicEras musicEras) {
		listOfMusicians.add(musicEras);
	}

	public List<? super MusicEras> getlistOfMusicians() {
		return listOfMusicians;
	}

	public void removeMusicians(int index) {
		listOfMusicians.remove(index);
	}

}
