package lists;

import java.util.HashSet;
import java.util.Set;

import music.types.groups.Performer;

public class PerformerList {
	Set<Performer> setOfPerformer;
	
	public PerformerList() {
		setOfPerformer = new HashSet<Performer>();
	}

	/**
	 * Adding an object to the setOfPerformer
	 */
	public void setPerformer(Performer performer) {
		setOfPerformer.add(performer);
	}

	/**
	 * Getting an object from the setOfPerformer
	 */
	public Set<Performer> getSetOfPerformer() {
		return setOfPerformer;
	}

	/**
	 * The object is deleted if the input parameter of the method matches the given
	 * parameter
	 * 
	 * @param performerName - the input parameter of the method
	 */
	public void removePerformer(String mperformerName) {
		for (Performer performer : setOfPerformer) {
			if (performer.performerName.equals(mperformerName))
				setOfPerformer.remove(performer);
			break;
		}
	}
}
