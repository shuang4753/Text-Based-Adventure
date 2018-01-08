import java.util.InputMismatchException;
import java.util.Scanner;
public class WorldHistoryRoom extends Room
{
	

	private static boolean cantMove=true;

	public WorldHistoryRoom(int x, int y, boolean explored) 
	{	
		super(x, y, explored);

	}
		
	public void enterRoom(Person x) 
	{
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		Scanner in2 = new Scanner(System.in);
		String answer="";
		
		while(cantMove)
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
			
			if (answer.equals("Japan") || equals("japan"))	
			{
				System.out.println("Congratualions! You received the World History Badge! Move to another room!");
				cantMove= false;
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
