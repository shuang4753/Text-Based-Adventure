
public class Room {
	private Person occupant;
	private int xLoc;
	private int yLoc;
	private boolean explored;
	private boolean cantMove;
	private int difficulty;
	
	
	public Room(int x, int y, int difficulty)
	{
		xLoc = x;
		yLoc = y;
		this.explored=false;
		this.cantMove=true;
		difficulty=Board.getDifficulty();

	}
	
	public void enterRoom(Person x)
	{
		System.out.println("\nYou enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		explored=true;
	}
	
	public void print()	
	{
		
		if (!explored)
		{
			System.out.print("[?]");
		}
		
		else if (!(occupant==null))	
		{
			System.out.print("[" +  getOccupant().getFirstName() + "]");
		}
		else
		{
			System.out.print("[ ]");
		}
	}
	
	public Person getOccupant() {
		return occupant;
	}


	public void setOccupant(Person occupant) {
		this.occupant = occupant;
	}


	public int getxLoc() {
		return xLoc;
	}


	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}


	public boolean isExplored() {
		return explored;
	}


	public void setExplored(boolean explored) {
		this.explored = explored;
	}


	public int getyLoc() {
		return yLoc;
	}


	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}
	
	public boolean isCantMove() {
		return cantMove;
	}

	public void setCantMove(boolean cantMove) {
		this.cantMove = cantMove;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
}

