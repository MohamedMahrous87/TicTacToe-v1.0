import java.util.*;

public class Game {

		private static char[] posn = {'1','2','3','4','5','6','7','8','9'};
		
		//game constructor
		public Game() {
		System.out.println("===================================================================================");
		System.out.println("=============================  Wellcom to TIC TAC TOU =============================");
		System.out.println("===================================================================================");
		System.out.println("=====================Enter Players Names And Symbols( X  or O )====================");
	}

		
		//showing choices menu for players
		public static int menu() {

	        int selection = 0 ;
	        String val;
	        Scanner input = new Scanner(System.in);

	        /***************************************************/

	        // Display menu graphics
	        System.out.println("============================");
	        System.out.println("|Tic Tac Toe MENU SELECTION|");
	        System.out.println("============================");
	        System.out.println("| Options:                 |");
	        System.out.println("|        1. play           |");
	        System.out.println("|        2. Show Score     |");
	        System.out.println("|        3. Exit           |");
	        System.out.println("============================");
	        
	        while(selection <= 0 || selection > 3) {
	        	
	 	       	System.out.println("-------------------------\n");
	 	       	System.out.println("Enter A Valid Number : ");
	 	    	val = input.next();
	 	    	selection = Character.getNumericValue(val.charAt(0));
	 	    	//System.out.println(selection);
	        }
	        	return selection; 
	        	
	    }

		
		//painting playground for all players
		public static void paintBoard() {
		  
		  //  System.out.println( "\n\n" );
			System.out.println(  "\n" );
			System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\t\t" + posn [0] + "   | " +posn [1]+ "  | " +posn [2]);
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\t\t" +posn [3]+ "   | " +posn [4]+ "  | " +posn [5]);
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  " \t\t ___|____|___ " );
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\t\t" +posn [6]+ "   | " +posn [7]+ "  | " +posn [8]);
	        System.out.println(  " \t\t    |    |   " );
	        System.out.println(  "\n" ); 
	        

	  }
		
		
		//painting playground for all players
		public static void move() {
			Scanner move =  new Scanner(System.in);
			System.out.print(  "press number to play (X) player >> " ); 
			move.next();
		}
		}
		
		
}
