import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculusRoom extends Room {
	private static boolean cantMove= true;
	public CalculusRoom(int x, int y, boolean explored) {
		super(x, y, explored);
		
	}
	
	public void enterRoom(Person x)	{
		x.setxLoc(getxLoc());
		x.setyLoc(getyLoc());
		String answer="";
		Scanner in3 = new Scanner(System.in);
		while(cantMove)	
		{
			System.out.print("What is the integral of u prime over u? (u'/u)");
			try	
				{answer=in3.nextLine();}
			
			catch (InputMismatchException e)
				{System.out.print("That's not the correct answer. Try again. \n");}
			
			if (answer.equals("lnu") || equals("natural log of u") || equals("ln(u)"))
				{System.out.println("Congratulations! You passed Calculus! Move to another room!");
					cantMove= false;}
			
		}
		
		}
	
	public void print()	
	{
		if (!isExplored())
		{
			System.out.print("[C]");
		}
		
	}	
}


