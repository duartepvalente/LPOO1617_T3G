package maze;

public class Map {
	public int herox, heroy;
	public static void main(String arg[]){
		char[][] map = new char[][]	{ 		
			{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
			{'X', 'H', 0, 0, 'I', 0, 'X', 0, 'G', 'X'},
			{'X', 'X', 'X', 0, 'X', 'X', 'X', 0, 0, 'X'},
			{'X', 0, 'I', 0, 'I', 0, 'X', 0, 0, 'X'},
			{'X', 'X', 'X', 0, 'X', 'X', 'X', 0 , 0, 'X'},
			{'I', 0, 0, 0, 0, 0, 0, 0, 0, 'X'},
			{'I', 0, 0, 0, 0, 0, 0, 0, 0, 'X'},
			{'X', 'X', 'X', 0, 'X', 'X', 'X', 'X', 0, 'X'},
			{'X', 0, 'I', 0, 'I', 0, 'X', 'k', 0, 'X'},
			{'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
		};
		
		Map m = new Map();
		m.printmap(map);
		
	}
	////
	
	public void printmap(char[][] map){
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	/////
	
	public void userinput(){
		System.out.println("Up(U), down(D), left(L) or right(R)?");
		String command = System.in.toString();
		switch(command){
		case "u": 
			break;
		case "d":
			break;
		case "l":
			break;
		case "r":
			break;
		default: System.out.println("Invalid Command, please try again.");
				command=null;
				userinput();
		break;
		}
	}
	/////
	public void Movement(){
		
		
	}
}