import java.util.Scanner;

public class GeometryRoom extends Room {
	Person occupant;
	private static boolean cantMove = true;
	private double problem;
	private double num1;
	private double num2;
	
	public GeometryRoom(int x, int y,double problem, double num1,double num2)	{
		super(x,y);
		this.problem=problem;
		this.num1=num1;
		this.num2=num2;
	}
	
	public void enterRoom(Person x)	{
		num1=(Math.random()*5);
		num2=(Math.random()*5);
		problem = num1 + num2;
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		Scanner in = new Scanner(System.in);
		while (cantMove)	{
			System.out.println(problem);
			String answer=in.nextLine();
			if (answer.equals(num1+num2))	{
				cantMove = false;
			}
		}
		in.close();
	}
}

