import java.util.Scanner;

public class GeometryRoom extends Room {
	Person occupant;
	private static boolean cantMove = true;
	String problem;
	
	public GeometryRoom(int x, int y,String problem)	{
		super(x,y);
		this.problem=problem;
		
	}
	
	public void enterRoom(Person x)	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		Scanner in = new Scanner(System.in);
		while (cantMove)	{
			System.out.println(problem);
			String answer=in.nextLine();
			if (answer.equals("6"))	{
				cantMove = false;
			}
		}
		in.close();
	}
}

