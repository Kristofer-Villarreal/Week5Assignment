package week5Assignment;

public class SpaceLogger implements Logger {

	/*
	 *  H e l l o
	 */
	
	@Override
	public void log(String message) {
			System.out.println(buildMsg(message));
		
	}
	
	private String buildMsg(String message) {
		StringBuilder s = new StringBuilder();
		
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			s.append(ch).append(" ");
		}
		
		s.setLength(s.length() - 1);
		
		return s.toString();
	}

	/*
	 *  ERROR: H e l l o
	 */
	
	@Override
	public void error(String message) {
		
		System.out.println("ERROR: " + buildMsg(message));
	}
}
