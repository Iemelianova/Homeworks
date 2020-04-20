package exceptions;

public class EmptyExc extends Exception{
	 

	public EmptyExc(String empMessage) {
				
	}
	
	public static String printEmpMessage() {
        return "Sorry, you can't add emptiness.";
    }
}
	


