import java.util.Scanner;

public class Board {
	//xD
	private Room[][] rooms;
	private static String name;
	private static int difficulty;
	
	//This constructor creates a board using an int. Must create all the rooms in this constructor.
	public Board(int size, String name, int difficulty)	{
		this.rooms=new Room[size][size];
		difficulty=0;
		name="";
		
		for (int x = 0; x<size; x++)
		{
			for (int y = 0; y < size; y++)
			{
				getRooms()[x][y] = new Room(x,y, 0);
				getRooms()[x][y].print();
			}
			System.out.println();
		}
		//Create a random winning room.
				int x = (int)(Math.random()*size);
				int y = (int)(Math.random()*size);
				getRooms()[x][y] = new TestingRoom(x, y,0);
				
		//Create a random Geometry room
				int a = (int)(Math.random()*size);
				int b = (int)(Math.random()*size);
				getRooms()[a][b] = new ArithmeticRoom(a,b,0,5,5); 
				
		//Create a random World History Room
				int c = (int)(Math.random()*size);
				int d = (int)(Math.random()*size);
				getRooms()[c][d] = new WorldHistoryRoom(c,d,0);
		
		//Create a random Calculus Room
				int e = (int)(Math.random()*size);
				int f = (int)(Math.random()*size);
				getRooms()[0][0] = new CalculusRoom(e,f,0);
	}
	
	
	public Board(Room[][] rooms) {
		this.rooms=rooms;
	}
	
	public void printBoard()	
	{
		for (Room[]i : rooms)	
		{
			for (Room x : i)	
			{
				x.print();
			}
			System.out.println();
		}
	}

	public Room[][] getRooms() {
		return rooms;
	}

	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	public static void determineInfo()
	{
		Scanner prereq = new Scanner(System.in);
		String difficulty_String = "";
		
		
		System.out.println("O no its that time of the academic year where students stress most - Midterm week! \n"
				+ "For adequate preperation, you must go around the floor reviewing specific subjects. \n"
				+ "Once you answer that subjects respective question correctly, congratz, you can move on to another room.\n"
				+ "\nLet's begin with your name. What is your name?");
		name=prereq.nextLine();
		
		
		System.out.println("Awesome " + name +"! Now how much preperation would you like? (Please type in 'a little', 'adequate', or 'a lot' for the amount of review you want)");
		while ((!(difficulty_String.equals("a little")) || !(difficulty_String.equals("a lot")) || !(difficulty_String.equals("adequate"))))
	
		{
			difficulty_String= prereq.nextLine();		
			
			if (difficulty_String.equals("a little"))
			{
				setDifficulty(1);
				break;
			}
		
			else if (difficulty_String.equals("adequate"))
			{
				setDifficulty(2);
				break;
			}
		
			else if (difficulty_String.equals("a lot"))
			{
				setDifficulty(3);
				break;
			}
		
			else 
			{
				System.out.println("Please type in 'a little' or 'adequate' or 'a lot.'");
			}
		}
		
		System.out.println("If the map does not show a capital A, H, C, and T please restart the game.");
	}


	public static String getName() {
		return name;
	}


	public void setName(String name) {
		Board.name = name;
	}


	public static int getDifficulty() {
		return difficulty;
	}


	public static void setDifficulty(int difficulty) {
		Board.difficulty = difficulty;
	}


}


