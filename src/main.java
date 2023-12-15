
public class main {

	public main() {
		// TODO Auto-generated constructor stub
		//creating player 1
		Player p1 =  new Player();
		
		//creating player 2
		Player p2 =  new Player();
	}

	static void getPlayers() {
		
		//creating first player and reading data 
		
		p1.readName();
		p1.readSymbol();
		System.out.println(" wellcom in the game " + p1.getName());
		
		//creating seconde player and reading data
	
		p2.readName();
		p2.readSymbol();
		System.out.println(" wellcom in the game " + p2.getName());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getPlayers();
		


	}

}
