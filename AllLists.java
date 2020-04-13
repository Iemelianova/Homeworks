import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import music.types.groups.Performer;
import music.types.vocals.Choir;
import music.rhythm.Author;
import music.types.groups.MusicGroups;

public class AllLists {

	List<Author> listAuthor;
	List<MusicGroups> listMusicGroups;
	Set<Performer> setOfPerformer;
	Map<String, Choir> mapOfChoir;

	public AllLists() {
		listAuthor = new ArrayList<Author>();

		listMusicGroups = new LinkedList<MusicGroups>();

		setOfPerformer = new HashSet<Performer>();

		mapOfChoir = new HashMap<String, Choir>();
	}

	/**
	 * Adding an object to the listAuthor
	 */
	public void setAuthor(Author author) {
		listAuthor.add(author);
	}

	public List<Author> getListAuthor() {
		return listAuthor;
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param authorName - the input parameter of the method
	 */
	public void removeAuthor(String authorName) {
		for (Author author : listAuthor) {
			if (author.composer.equals(authorName))
				listAuthor.remove(author);
			break;
		}
	}

	public void setMusicGroups(MusicGroups group) {
		listMusicGroups.add(group);
	}

	public List<MusicGroups> getListMusicGroups() {
		return listMusicGroups;
	}

	public void removeGroup(String mgrouprName) {
		for (MusicGroups group : listMusicGroups) {
			if (group.groupName.equals(mgrouprName))
				listMusicGroups.remove(group);
			break;
		}
	}

	public void setPerformer(Performer performer) {
		setOfPerformer.add(performer);
	}

	public Set<Performer> getSetOfPerformer() {
		return setOfPerformer;
	}

	public void removePerformer(String mperformerName) {
		for (Performer performer : setOfPerformer) {
			if (performer.performerName.equals(mperformerName))
				setOfPerformer.remove(performer);
			break;
		}
	}

	public void setChoir(Choir choir) {
		mapOfChoir.put(choir.choirName, choir);
	}

	public Choir getChoir(String choirName) {
		return mapOfChoir.get(choirName);
	}

	/**
	 * The object is deleted by the input parameter, which also is the key of the
	 * map
	 * 
	 * @param ensembleName - the input parameter of the method
	 */
	public void removeEnsemble(String ensembleName) {
		mapOfChoir.remove(ensembleName);

	}
}