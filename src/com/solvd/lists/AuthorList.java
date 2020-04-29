package lists;

import java.util.ArrayList;
import java.util.List;

import music.rhythm.Author;

public class AuthorList {
	List<Author> listAuthor;

	public AuthorList() {
		listAuthor = new ArrayList<Author>();
	}

	/**
	 * Adding an object to the listAuthor
	 */
	public void setAuthor(Author author) {
		listAuthor.add(author);
	}

	/**
	 * Getting an object from the listAuthor
	 */
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

}
