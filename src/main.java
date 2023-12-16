
public class main {

	// Generate game object
	static Game game =  new  Game();
	
	//creating player 1
	static Player p1 =  new Player();
	
	//creating player 2
	static Player p2 =  new Player();


	public static void getPlayers() {
		
		//creating first player and reading data 
		//Player p1 =  new Player();
		p1.readName();
		p1.readSymbol();
		System.out.println(" wellcom in the game " + p1.getName());
		
		//creating seconde player and reading data
		//Player p2 =  new Player();
		p2.readName();
		p2.readSymbol();
		System.out.println(" wellcom in the game " + p2.getName());
		
	}
	
	
	public static void printPlayers() {
		
		p1.print();
		p2.print();
		
	}
	
	
	public static void main(String[] args) {
		
	
		//getting players data
		//main m = new main();
		getPlayers();
		printPlayers();


	}

}
