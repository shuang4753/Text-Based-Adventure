import java.util.Scanner;

public class CalculusRoom extends Room {
	
	
	public CalculusRoom(int x, int y, int difficulty) {
		super(x, y, 0);
		
	}
	
	public void enterRoom(Person x)	
	{
		setOccupant(x);
		x.setxLoc(getxLoc());
		x.setyLoc(getyLoc());
		String answer="";
		Scanner in3 = new Scanner(System.in);
		
		while(isCantMove())	
		{
			if (Board.getDifficulty()==1)
			{
				System.out.print("What is the derivative of ln(x)?");
				answer=in3.nextLine();
				if (answer.equals("1/x"))
				{
					System.out.println("Congratulations! You passed Calculus and received the Derivative! Move to another room!\n");
					setCantMove(false);
					getOccupant().setDerivative(true);
				}
			
				else
				{
					System.out.println("Wrong answer, try again");
				}
			}
			
			if (Board.getDifficulty()==2)
			{
				System.out.print("What is the derivative of sin(x)?");
				answer=in3.nextLine();
				if (answer.equals("cos(x)") || answer.equals("cosine of x") || answer.equals("cosx"))
				{
					System.out.println("Congratulations! You passed Calculus and received the Derivative! Move to another room!\n");
					setCantMove(false);
					getOccupant().setDerivative(true);
				}
			
				else
				{
					System.out.println("Wrong answer, try again");
				}
			}
			
			if (Board.getDifficulty()==3)
			{
				System.out.print("What is the derivative of ln(sin(x))?");
				answer=in3.nextLine();
				if (answer.equals("cos(x)/sin(x)") || answer.equals("cot(x)") || answer.equals("cotangent of x"))
				{
					System.out.println("Congratulations! You passed Calculus and received the Derivative! Move to another room!\n");
					setCantMove(false);
					getOccupant().setDerivative(true);
				}
			
				else
				{
					System.out.println("Wrong answer, try again");
				}
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

