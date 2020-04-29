package menu;

import java.util.*;

import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;
import lists.MGroupList;
import music.types.groups.MusicGroups;

public class MGroupMenu {

	public MGroupMenu() {
	}

	static MGroupList mlist = new MGroupList();

	static Scanner scanm = new Scanner(System.in);
	static Scanner scanm1 = new Scanner(System.in);

	public static void openMGroupMenu() throws PastCenturyExc, FutureCenturyExc, EmptyExc {

		System.out.println("Let's try to add new music group. \n" + "Please, enter century (use numbers, please): \n");
		int group1century = scanm.nextInt();

		if (group1century < 14) {
			throw new PastCenturyExc(PastCenturyExc.printPastMessage());
		}

		if (group1century > 21) {
			throw new FutureCenturyExc(FutureCenturyExc.printFutMessage());
		}

		System.out.println("Please, enter music era: \n");
		String group1era = scanm1.nextLine();

		System.out.println("Please, enter music genre: \n");
		String group1genre = scanm1.nextLine();

		System.out.println("Please, enter name of music group. \n");
		String group1name = scanm1.nextLine();

		if (group1name.isEmpty()) {
			throw new EmptyExc(EmptyExc.printEmpMessage());
		}

		MusicGroups group = new MusicGroups(group1century, group1era, group1genre, group1name);

		mlist.setMusicGroups(group);
		System.out.println("You added next information: ");

		for (MusicGroups groups : mlist.getListMusicGroups()) {
			group.printInfo();
		}
	}

	public static void removeFromMGroupMenu() {
		System.out.println("Please, enter music group name: \n");
		String mgroupName = scanm.nextLine();
		mlist.removeGroup(mgroupName);
		System.out.println("Music group " + mgroupName + " was successfully removed.");
	}
}