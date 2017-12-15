
public class Room {
	private Person occupant;
	protected int xLoc;
	private boolean explored;
	private int yLoc;
	
	
	public Room(int x, int y,boolean explored)
	{
		xLoc = x;
		yLoc = y;
		this.explored=explored;
	}
	
	
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	
	public void print()	
	{
		if (!explored && occupant==null)
		{
			System.out.print("[ ]");
		}
		
		/*else if (explored && !(occupant==null))
		{	
			System.out.print("["+rooms.print+"]");	
		}*/
		
		else if (!(occupant==null))
		{
			System.out.print("[" + occupant.firstName + "]");
		}
	}
}
