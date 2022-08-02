package week5Assignment;

public class App {
	
		static Logger asteriskLogger = new AsteriskLogger();
		static Logger BuildMsg = new SpaceLogger();

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			asteriskLogger.log("Hello");
			System.out.println();
			
			asteriskLogger.error("Hello");
		
		
			
			System.out.println();
			
			
			
			BuildMsg.log("Hello");
			System.out.println();
			
			BuildMsg.error("Hello");
			
		
	}

}
