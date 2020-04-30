package menu;

import java.util.*;

import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;
import lists.AuthorList;
import lists.ChoirList;
import lists.MGroupList;
import lists.PerformerList;
import menu.AuthorMenu;
import music.rhythm.Author;
import music.types.groups.MusicGroups;
import music.types.groups.Performer;
import music.types.vocals.Choir;

public class Menu {

	public Menu() {
	}

	public void openMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Music Library!");

		while (true) {
			System.out.println("What do you want to do? \n" + "Enter: \n" + "1 - if you want to add a new composer, \n"
					+ "2 - if you want to add a new music group, \n"
					+ "3 - if you want to add a new music performer, \n"
					+ "4 - if you want to add a new musical ensemble. \n" + "5 - if you want to remove a composer, \n"
					+ "6 - if you want to remove a music group, \n" + "7 - if you want to remove a music performer, \n"
					+ "8 - if you want to remove a musical ensemble. \n" + "0 - if you want to exit. \n");

			try {

				int adding = scan.nextInt();

				switch (adding) {
				case 1:

					AuthorMenu.openAuthorMenu();

					break;

				case 2:

					MGroupMenu.openMGroupMenu();

					break;

				case 3:
					PerformerMenu.openPerformerMenu();
						
					break;

				case 4:

					ChoirMenu.openChoirMenu();

					break;

				case 5:

					AuthorMenu.removeFromAuthorMenu();

					break;

				case 6:

					MGroupMenu.removeFromMGroupMenu();

					break;

				case 7:

					PerformerMenu.removeFromPerformerMenu();

					break;

				case 8:
						
					ChoirMenu.removeFromChoirMenu();

					break;

				case 0:
						
					System.exit(0);
						
					break;

				default:
					System.out.println("Please, use numbers from 0 to 8.");
						
					break;
				}

			} catch (InputMismatchException | IllegalArgumentException miss) {

				System.out.println("Please, use numbers.");
			} finally {
				System.out.println("Have a nice day!");
			}

			break;
		}

	}

}
