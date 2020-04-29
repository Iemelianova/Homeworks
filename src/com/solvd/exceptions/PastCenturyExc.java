package exceptions;

public class PastCenturyExc extends Exception{
	

	public PastCenturyExc(String pastMessage) {

	}
	
	public static String printPastMessage() {
        return "Sorry, you can't add information about figures of the 14th century or earlier.";
    }
}
