import exceptions.EmptyExc;
import exceptions.FutureCenturyExc;
import exceptions.PastCenturyExc;

public class Executor {


	public static void main(String[] args) throws FutureCenturyExc, PastCenturyExc, EmptyExc {

		Menu menu = new Menu();
		menu.openMenu();
	}
}
