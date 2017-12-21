import java.util.Scanner;
//xD
public class Runner {
	

	private static boolean gameOn = true;
	
	public static void main(String[] args)
	{
		Room[][] building = new Room[5][5];
		
		//Enter in a int or the array called building. Different boards can be created.
		Board map = new Board(building);
		
		
		//This for loop creates a Board using the 2d array called building
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y, false);
				building[x][y].print();
				
			}
			System.out.println();
		}
		
		//Create a random winning room.
		int x = (int)(Math.random()*building.length);
		int y = (int)(Math.random()*building.length);
		building[x][y] = new WinningRoom(x, y, false);
		
		//Create a random Geometry room
		int a = (int)(Math.random()*building.length);
		int b = (int)(Math.random()*building.length);
		building[a][b] = new GeometryRoom(a,b,5,5); 
		
		//Create a random World History Room
		int c = (int)(Math.random()*building.length);
		int d = (int)(Math.random()*building.length);
		building[c][d] = new WorldHistoryRoom(c,d,false);
		
		//Create a random Calculus Room
		int e = (int)(Math.random()*building.length);
		int f = (int)(Math.random()*building.length);
		building[0][0] = new CalculusRoom(e,f,false);
		
		
		//Setup player 1 and the input scanner
		Person player1 = new Person("Simon", "Huang", 0,0);
		map.getRooms()[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose W, A, S, D)");
			String move = in.nextLine();
			if(validMove(move, player1, map.getRooms()))
			{	
			
				System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
				
			}
			else {
				System.out.println("Please choose a valid move.");
			}
			
			map.printBoard();
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "w":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					
					return true;
				}
				else
				{
					return false;
				}
			case "d":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "a":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		
		return true;
	}
	public static void gameOff()
	{
		gameOn = false;
	}
	


}
