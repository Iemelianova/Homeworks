package menu;

import java.util.*;

import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;
import lists.ChoirMap;
import music.types.vocals.Choir;

public class ChoirMenu {

	public ChoirMenu() {
	}

	static ChoirMap clist = new ChoirMap();

	static Scanner scanc = new Scanner(System.in);
	static Scanner scanc1 = new Scanner(System.in);

	public static void openChoirMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new ensemble. \n" + "Please, enter century (use numbers, please): \n");
		int choir1century = scanc.nextInt();

		if (choir1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (choir1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String choir1era = scanc1.nextLine();

		System.out.println("Please, enter music genre: \n");
		String choir1genre = scanc1.nextLine();

		System.out.println("Please, enter quantity of singers: \n");
		int choir1singers = scanc1.nextInt();

		System.out.println("Please, enter name of choir. \n");
		String choir1name = scanc1.nextLine();

		if (choir1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		Choir choir = new Choir(choir1century, choir1era, choir1genre, choir1singers, choir1name);

		clist.setChoir(choir);

		Choir choirFromList = clist.getChoir(choir.choirName);
		System.out.println("You added next information: ");
		System.out.println("Century: " + choirFromList.century);
		System.out.println("Music era: " + choirFromList.era);
		System.out.println("Music genre: " + choirFromList.genre);
		System.out.println("Singers: " + choirFromList.singers);
		System.out.println("Choir's name: " + choirFromList.choirName);

	}

	public static void removeFromChoirMenu() {
		System.out.println("Please, enter music ensemble name: \n");
		String ensembleName = scanc.nextLine();
		clist.removeEnsemble(ensembleName);
		System.out.println("Music ensemble " + ensembleName + " was successfully removed.");
	}

}