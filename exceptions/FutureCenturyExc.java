
package exceptions;


public class FutureCenturyExc extends Exception {
	
	
	public FutureCenturyExc(String futMessage) {

	}
	
	public static String printFutMessage() {
        return "Sorry, you can't add information about the figures of future centuries.";
    }
}