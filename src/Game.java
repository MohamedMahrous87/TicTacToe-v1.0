
import java.util.*;
public class Game {

	
	
	public Game() {
		System.out.println("===================================================================================");
		System.out.println("=============================  Wellcom to TIC TAC TOU =============================");
		System.out.println("===================================================================================");
		System.out.println("=====================Enter Players Names And Symbols( X  or O )====================");
	}

	
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
	
}
