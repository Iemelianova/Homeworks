
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;

import music.rhythm.Author;
import music.types.groups.MusicGroups;
import music.types.groups.Performer;
import music.types.vocals.Choir;

public class Executor {

	public static void main(String[] args) {

		AllLists lists = new AllLists();

		System.out.println("Welcome to Music Library!");

		while (true) {
			System.out.println("What do you want to do? \n" + "Enter: \n" + "1 - if you want to add a new composer, \n"
					+ "2 - if you want to add a new music group, \n"
					+ "3 - if you want to add a new music performer, \n"
					+ "4 - if you want to add a new musical ensemble. \n" + "5 - if you want to remove a composer, \n"
					+ "6 - if you want to remove a music group, \n" + "7 - if you want to remove a music performer, \n"
					+ "8 - if you want to remove a musical ensemble. \n" + "0 - if you want to exit. \n");
			Scanner scan = new Scanner(System.in);
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			int adding = scan.nextInt();
			if (adding == 0) {
				break;
			}

			switch (adding) {
			case 1:

				System.out.println(
						"Let's try to add new composer. \n" + "Please, enter century (use numbers, please): \n");
				int author1century = scan.nextInt();

				System.out.println("Please, enter music era: \n");
				String author1era = scan1.nextLine();

				System.out.println("Please, enter music kind(major, minor): \n");
				String author1kind = scan1.nextLine();

				System.out.println("Please, enter composer name. \n");
				String author1composer = scan1.nextLine();

				Author author = new Author(author1century, author1era, author1kind, author1composer);

				lists.setAuthor(author);
				System.out.println("You added next information: ");

				for (Author authors : lists.getListAuthor()) {
					author.printInfo();
				}

				break;
				
			case 2:

				System.out.println(
						"Let's try to add new music group. \n" + "Please, enter century (use numbers, please): \n");
				int group1century = scan.nextInt();

				System.out.println("Please, enter music era: \n");
				String group1era = scan1.nextLine();

				System.out.println("Please, enter music genre: \n");
				String group1genre = scan1.nextLine();

				System.out.println("Please, enter name of music group. \n");
				String group1name = scan1.nextLine();

				MusicGroups group = new MusicGroups(group1century, group1era, group1genre, group1name);

				lists.setMusicGroups(group);
				System.out.println("You added next information: ");

				for (MusicGroups groups : lists.getListMusicGroups()) {
					group.printInfo();
				}

				break;
				
			case 3:
				System.out.println(
						"Let's try to add new performer. \n" + "Please, enter century (use numbers, please): \n");
				int performer1century = scan.nextInt();

				System.out.println("Please, enter music era: \n");
				String performer1era = scan1.nextLine();

				System.out.println("Please, enter music genre: \n");
				String performer1genre = scan1.nextLine();

				System.out.println("Please, enter name of performer. \n");
				String performer1name = scan1.nextLine();

				Performer performer = new Performer(performer1century, performer1era, performer1genre, performer1name);

				lists.setPerformer(performer);
				System.out.println("You added next information: ");

				for (Performer pefrormer : lists.getSetOfPerformer()) {
					performer.printInfo();
				}

				break;

			case 4:
				System.out.println(
						"Let's try to add new ensemble. \n" + "Please, enter century (use numbers, please): \n");
				int choir1century = scan.nextInt();

				System.out.println("Please, enter music era: \n");
				String choir1era = scan1.nextLine();

				System.out.println("Please, enter music genre: \n");
				String choir1genre = scan1.nextLine();

				System.out.println("Please, enter quantity of singers: \n");
				int choir1singers = scan1.nextInt();

				System.out.println("Please, enter name of choir. \n");
				String choir1name = scan2.nextLine();

				Choir choir = new Choir(choir1century, choir1era, choir1genre, choir1singers, choir1name);

				lists.setChoir(choir);

				Choir choirFromList = lists.getChoir(choir.choirName);
				System.out.println("You added next information: ");
				System.out.println("Century: " + choirFromList.century);
				System.out.println("Music era: " + choirFromList.era);
				System.out.println("Music genre: " + choirFromList.genre);
				System.out.println("Singers: " + choirFromList.singers);
				System.out.println("Choir's name: " + choirFromList.choirName);

				break;

			case 5:
				System.out.println("Please, enter composer name: \n");
				String authorName = scan1.nextLine();
				lists.removeAuthor(authorName);
				System.out.println("Composer " + authorName + " was successfully removed.");

				break;

			case 6:
				System.out.println("Please, enter music group name: \n");
				String mgroupName = scan1.nextLine();
				lists.removeAuthor(mgroupName);
				System.out.println("Music group " + mgroupName + " was successfully removed.");

				break;

			case 7:
				System.out.println("Please, enter music performer name: \n");
				String mperformerName = scan1.nextLine();
				lists.removePerformer(mperformerName);
				System.out.println("Music performer " + mperformerName + " was successfully removed.");

				break;

			case 8:
				System.out.println("Please, enter music ensemble name: \n");
				String ensembleName = scan1.nextLine();
				lists.removeEnsemble(ensembleName);
				System.out.println("Music ensemble " + ensembleName + " was successfully removed.");

				break;

			default:
				System.out.println("Please, use numbers from 0 to 8.");
				break;

			}
		}
	}

}
