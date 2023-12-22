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
		public static void paintBoard(int i, char sy) {
		  
			if (i <= 0) {
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
			}else{
				posn[i-1] = sy;
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
	        
	  }
		
		
		//get player move
		public static int getMove(char psymbol) {
			int nmove = 0;
			String smove;
			Scanner move =  new Scanner(System.in);
			
			//getting player move number and checking if number is valied number 
			//and checking if move winer or not
			while(nmove <= 0 || nmove > 9) {
				
			System.out.print(  "press move number to play ( " + psymbol +" ) player >> " ); 
			smove = move.next();
			nmove = Character.getNumericValue(smove.charAt(0));
			System.out.println(nmove);
			}
			return nmove;
		}
		
		
		//checking movement
				
		//checking available position
			
		public static void ckeckAvail(int chkPmove,char sym) {
					
				switch(chkPmove) {
				case 1:
					if(posn[0] == '1' ) {
						paintBoard(1 , sym);
					}else {
						getMove(sym);
					}
					break;
				case 2:
					if(posn[1] == '2' ) {
						paintBoard(2 , sym);
					}else if( posn[1] == 'o' || posn[1] == 'O'  ) {
						
						paintBoard(2 , sym);
					}else {
						paintBoard(2 , sym);
					}
					break;
				case 3:
					if(posn[2] == '3' ) {
						paintBoard(3 , sym);
					}else if( posn[2] == 'o' || posn[2] == 'O'  ) {
						
						paintBoard(3 , sym);
					}else {
						paintBoard(3 , sym);
					}
					break;
				case 4:
					if(posn[3] == '4' ) {
						paintBoard(4 , sym);
					}else if( posn[3] == 'o' || posn[3] == 'O'  ) {
						
						paintBoard(4 , sym);
					}else {
						paintBoard(4 , sym);
					}
					break;
				case 5:
					if(posn[4] == '5' ) {
						paintBoard(5 , sym);
					}else if( posn[4] == 'o' || posn[4] == 'O'  ) {
						
						paintBoard(5 , sym);
					}else {
						paintBoard(5 , sym);
					}
					break;
				case 6:
					if(posn[5] == '6' ) {
						paintBoard(6 , sym);
					}else if( posn[5] == 'o' || posn[5] == 'O'  ) {
						
						paintBoard(6 , sym);
					}else {
						paintBoard(6 , sym);
					}
					break;
				case 7:
					if(posn[6] == '7' ) {
						paintBoard(7 , sym);
					}else if( posn[6] == 'o' || posn[6] == 'O'  ) {
						
						paintBoard(7 , sym);
					}else {
						paintBoard(7 , sym);
					}
					break;
				case 8:
					if(posn[7] == '8' ) {
						paintBoard(8 , sym);
					}else if( posn[7] == 'o' || posn[7] == 'O'  ) {
						
						paintBoard(8 , sym);
					}else {
						paintBoard(8 , sym);
					}
					break;
				case 9:
					if(posn[8] == '9' ) {
						paintBoard(9 , sym);
					}else if( posn[8] == 'o' || posn[8] == 'O'  ) {
						
						paintBoard(9 , sym);
					}else {
						paintBoard(9 , sym);
					}
					break;
				default:
				}
					
		}
				
				
		//checking the winner
		public static void ckeckWinner() {
				
				
				
		}
		
		
		
		
}
		
		

