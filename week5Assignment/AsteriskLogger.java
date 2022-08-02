package week5Assignment;

public class AsteriskLogger implements Logger {

	/*
	 * 
	 *  ***Hello***
	 *  
	 */
	
	@Override
	public void log(String message) {
		
		System.out.println("***" + message + "***");
	}

	/*
	 * 
	 *  **********************
	 *  *****ERROR: Hello*****
	 *  **********************
	 */
	
	@Override
	public void error(String message) {
		
		String asteriskError = "***" + "ERROR: " + message + "***";
		String asteriskCount = "*".repeat(asteriskError.length());
		
		System.out.println(asteriskCount);
		System.out.println(asteriskError);
		System.out.println(asteriskCount);
	}
}
