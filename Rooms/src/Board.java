
public class Board {
	//xD
	private Room[][] rooms;
	
	//This constructor creates a board using an int. Must create all the rooms in this constructor.
	public Board(int size)	{
		this.rooms=new Room[size][size];
		for (int x = 0; x<size; x++)
		{
			for (int y = 0; y < size; y++)
			{
				getRooms()[x][y] = new Room(x,y, false);
				getRooms()[x][y].print();
			}
			System.out.println();
		}
		//Create a random winning room.
				int x = (int)(Math.random()*size);
				int y = (int)(Math.random()*size);
				getRooms()[x][y] = new WinningRoom(x, y, false);
				
		//Create a random Geometry room
				int a = (int)(Math.random()*size);
				int b = (int)(Math.random()*size);
				getRooms()[a][b] = new GeometryRoom(a,b,5,5); 
				
		//Create a random World History Room
				int c = (int)(Math.random()*size);
				int d = (int)(Math.random()*size);
				getRooms()[c][d] = new WorldHistoryRoom(c,d,false);
		
		//Create a random Calculus Room
				int e = (int)(Math.random()*size);
				int f = (int)(Math.random()*size);
				getRooms()[0][0] = new CalculusRoom(e,f,false);
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
}


