import java.util.Scanner;

public class GeometryRoom extends Room {
	Person occupant;
	int sum;
	private static boolean canMove = false;
	
	public GeometryRoom(int x, int y)	{
		super(x,y);
		
	}
	
	public void enterRoom(Person x)	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		/*
		Scanner in = new Scanner(System.in);
		while (canMove)	{
			System.out.println("What does 2+2 equal to?");
			String answer=in.nextLine();
			if (answer.equals("4"))	{
				canMove = true;
			}
			in.close();
		}*/
	}
}

