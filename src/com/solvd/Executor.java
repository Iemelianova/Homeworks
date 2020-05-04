import java.io.IOException;

import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;
import menu.Menu;

public class Executor {

	public static void main(String[] args) throws PastCenturyExc, FutureCenturyExc, EmptyExc, IOException {

		Menu menu = new Menu();
		menu.openMenu();
	}
}
