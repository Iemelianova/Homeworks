package lists;

import java.util.HashMap;
import java.util.Map;

import music.types.vocals.Choir;

public class ChoirMap {
	Map<String, Choir> mapOfChoir;

	public ChoirMap() {
		mapOfChoir = new HashMap<String, Choir>();
	}

	/**
	 * Adding an object to the mapOfChoir
	 */
	public void setChoir(Choir choir) {
		mapOfChoir.put(choir.choirName, choir);
	}

	/**
	 * Getting an object from the mapOfChoir
	 */
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
