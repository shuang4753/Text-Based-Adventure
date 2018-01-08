import java.util.InputMismatchException;
import java.util.Scanner;

public class GeometryRoom extends Room 
{
	//private Person occupant;
	private int num1;
	private int num2;
	private static boolean cantMove=true;
	private boolean Reward_Shape=false;
	
	public GeometryRoom(int x, int y, int num1,int num2)	{
		super(x,y,false);
		
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public void enterRoom(Person x)
	{
		
		
		this.setExplored(true);
		num1=(int) (Math.random()*5);
		num2=(int) (Math.random()*5);
		int sum=num1+num2;
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		int answer=0;
		
		Scanner in1 = new Scanner(System.in);
		while (cantMove)	
		{
			System.out.println("What is "+num1+" plus "+num2+"?" );
			try 
			{
				answer=in1.nextInt();	
			}
			catch (InputMismatchException e)
			{
				in1.next();
				System.out.print("That's not an interger. Try again. \n");
			}
			
			if (answer == (sum)) 	
			{
				System.out.println("Congratulations, you earned the Geometry Badge! Move to another room!");
				
				cantMove = false;
			}
			
		}
		
	}
	public void print()
	{
		if (!isExplored())
		{
			System.out.print("[G]");
		}
	
		else
		{
			System.out.print("[G]");
		}
	}
}

