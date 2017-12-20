
public class WinningRoom extends Room {
	

	
	public WinningRoom(int x, int y, boolean explored) {
		super(x, y, false);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {
		// TODO Auto-generated method stub
		setOccupant(x);
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		System.out.println("You found the winning room! Ten points for Gryffindor.");
		Runner.gameOff();
	}
	

}
