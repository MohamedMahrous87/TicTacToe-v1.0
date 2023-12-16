import java.util.Scanner;


public class Player {

	
	//declaring variables for players class
	private String name;
	private char symbol;
	public  static int num = 0 ;
	public Scanner scan = new Scanner(System.in);
	
	//player constractor	
	public Player() {
		// TODO Auto-generated constructor stub
		
		name ="no name";
		symbol = 'n';
		num ++;
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

		System.out.println("PLZ enter player "+ num +" name : " );
		String s = scan.next();
		if(checkName(s)) {
			this.name = s;
		}else {
			readName();
		}
		
	}
		

	
	//Reading symbols from user for each player
	public void readSymbol() {
		
		
		System.out.println("PLZ enter player "+ num +" symbol (X or O) : " );
		
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
		System.out.println("player "+ num +" name : " + this.name + "  Symbol : " + this.symbol);
		
	}
	
}
