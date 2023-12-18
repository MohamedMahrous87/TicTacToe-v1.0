import java.util.Scanner;


public class Player {

	
	//declaring variables for players class
	private String name;
	private char symbol;
	public  static int num ;
	private int pnum ,score;
	public Scanner scan = new Scanner(System.in);
	public boolean winner = false;
	
	//player constractor	
	public Player() {
		// TODO Auto-generated constructor stub
		num = 0;
		name ="no name";
		symbol = 'n';
		score = 0 ;
		
		
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
	
	
	//Reading names from user for each player
	public void readName() {

			num++;
			pnum = num;
		System.out.print("PLZ enter player "+ num +" name : " );
		System.out.println();
		String s = scan.next();
		if(checkName(s)) {
			this.name = s;
		}else {
			readName();
			num -- ;
		}
	
	}
		
	//Reading symbols from user for each player
	public void readSymbol() {
		
		
		System.out.print("PLZ enter player "+ num +" symbol (X or O) : " );
		System.out.println();
		char c = scan.next().charAt(0);
		
		if(checkSymbol(c)) {
			this.symbol = c;
		}else {
			readSymbol();
	}
	
	}
	
	//validating names
	public boolean checkName(String pname){

		if((pname.equals(null)) || !pname.matches("^[a-zA-Z]*$")){
			
			return false;
		}
			return true;
	}
		
	//validating Symbols
	public boolean checkSymbol(char psymbol) {
		
		if(psymbol == 'X' || psymbol == 'x' || psymbol == 'O' || psymbol == 'o' ){
			
			return true;
		}
		return false;
	}


	//printing players data
	public void print() {
		System.out.println("player "+ pnum +" name : " + this.name + "  Symbol : " + this.symbol);
	
	}
	
}
