package menu;

import java.util.*;

import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;
import lists.AuthorList;
import music.rhythm.Author;

public class AuthorMenu {

	public AuthorMenu() {
	}

	static AuthorList alist = new AuthorList();

	static Scanner scana = new Scanner(System.in);
	static Scanner scana1 = new Scanner(System.in);

	public static void openAuthorMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new composer. \n" + "Please, enter century (use numbers, please): \n");
		int author1century = scana.nextInt();

		if (author1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (author1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String author1era = scana1.nextLine();

		System.out.println("Please, enter music kind(major, minor): \n");
		String author1kind = scana1.nextLine();

		System.out.println("Please, enter composer name. \n");
		String author1composer = scana1.nextLine();

		if (author1composer.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Author author = new Author(author1century, author1era, author1kind, author1composer);

		alist.setAuthor(author);
		System.out.println("You added next information: ");
		for (Author authors : alist.getListAuthor()) {
			author.printInfo();
		}

	}

	public static void removeFromAuthorMenu() {
		System.out.println("Please, enter composer name: \n");
		String authorName = scana.nextLine();
		alist.removeAuthor(authorName);
		System.out.println("Composer " + authorName + " was successfully removed.");
	}
}