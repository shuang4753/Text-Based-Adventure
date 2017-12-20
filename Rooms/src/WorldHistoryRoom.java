
public class WorldHistoryRoom extends Room{
	
	private String question;

	public WorldHistoryRoom(int x, int y, boolean explored, String question) 
	{	
		super(x, y, explored);
		this.question= question;
	}
		
	public void enterRoom(Person x) {
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		
		while
	}

}
