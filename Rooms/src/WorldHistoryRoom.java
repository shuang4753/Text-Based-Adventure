import java.util.InputMismatchException;
import java.util.Scanner;
public class WorldHistoryRoom extends Room
{
	
	

	public WorldHistoryRoom(int x, int y) 
	{	
		super(x, y);

	}
		
	public void enterRoom(Person x) 
	{
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		Scanner in2 = new Scanner(System.in);
		String answer="";
		
		while(isCantMove())
		{
			
			System.out.print("Which nation is known as the land of the Rising Sun? ");
			try 
			{
				answer=in2.nextLine();
			}
			catch (InputMismatchException e)
			{
				
				System.out.print("That's not the correct answer. Try again. \n");
			}
			
			if (answer.equals("Japan") || answer.equals("japan"))	
			{
				System.out.println("Congratualions! You received the World History Badge! Move to another room!");
				setCantMove(false);
				getOccupant().setOldTextbook(true);
			}
			
			else {
				System.out.println("Wrong answer, try again.");
			}
		}
	}
			
			
			
		
		
	public void print()
	{
		if (!isExplored())
		{
			System.out.print("[H]");
		}
	}

}
