
public class Board {
	
	private Room[][] rooms;
	
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


