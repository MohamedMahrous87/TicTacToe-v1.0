
public class main {

	
	// Generate game object
		public static Game game =  new  Game();
	
	//creating player 1
		public static Player p1 =  new Player();
	
	//creating player 2
		public static Player p2 =  new Player();
	//getting move position on the board
		public static int pmove;
		
	//winner stat
		public static boolean winner = false;
		
	//player symbol	
		public static char symb1;
		
	
	public static void getPlayers() {
		
		//creating first player and reading data 
		//Player p1 =  new Player();
		p1.readName();
		p1.readSymbol();

		//creating seconde player and reading data
		//Player p2 =  new Player();
		p2.readName();
		p2.readSymbol();
		System.out.println(" wellcom in the game " + p1.getName() + " and " +p2.getName() );
		
	}
	
	
	public static void printPlayers() {
		
		p1.print();
		p2.print();
	
	}
	
	
	public static char getsymbol() {
		//finde the winner player to give the move
		
		if(!p1.winner && !p2.winner || p1.winner == true) {
			return  p1.getSymbol();
			
		}else {
			return p2.getSymbol();
		}
		
		
	}
	
	
	public static void main(String[] args) {
	
		
		//getting players data
		getPlayers();
	
		//show selection menu
		game.menu();
		
		//paint playground 
		game.paintBoard(0 , ' ');
		
		//getting first start player symbol
		symb1 = getsymbol(); 
		
		//playing and switching bettween players until we finde a winner
		while (!winner) {
			
		//get player move
		pmove = game.getMove(symb1);
		if(symb1 == 'x' || symb1 == 'X') {
			
			symb1 = 'O';
		}else {
			
			symb1 = 'X';
		}
		
		game.ckeckAvail(pmove,symb1);
		
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
