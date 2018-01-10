import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculusRoom extends Room {
	
	private static boolean derivative=false;
	public CalculusRoom(int x, int y) {
		super(x, y);
		
	}
	
	public void enterRoom(Person x)	{
		x.setxLoc(getxLoc());
		x.setyLoc(getyLoc());
		String answer="";
		Scanner in3 = new Scanner(System.in);
		while(isCantMove())	
		{
			System.out.print("What is the integral of u prime over u? (u'/u)");
			try	
			{
				answer=in3.nextLine();
			}
			
			catch (InputMismatchException e)
			{
				System.out.print("That's not the correct answer. Try again. \n");
			}
			
			if (answer.equals("lnu") || answer.equals("natural log of u") || answer.equals("ln(u)"))
			{
				System.out.println("Congratulations! You passed Calculus! Move to another room!");
					setCantMove(false);
					getOccupant().setDerivative(true);
			}
			else {
				System.out.println("Wrong answer, try again");
			}
			
			
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

