import java.util.Scanner;
public class WorldHistoryRoom extends Room
{
	
	

	public WorldHistoryRoom(int x, int y, int difficulty) 
	{	
		super(x, y, 0);

	}
		
	public void enterRoom(Person x) 
	{
		setOccupant(x);
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		Scanner in2 = new Scanner(System.in);
		String answer="";
		
		while(isCantMove())
		{
			if (Board.getDifficulty()==1)
			{
				System.out.print("Which nation is known as the land of the Rising Sun?");
				answer=in2.nextLine();;
				if (answer.equals("Japan") || answer.equals("japan"))
				{
					System.out.println("Congratualions! You received the Old Textbook! Move to another room!\n");
					setCantMove(false);
					getOccupant().setOldTextbook(true);
				}
						
				else 
				{
					System.out.println("Wrong answer, try again.");
				}
			}
			
			if (Board.getDifficulty()==2)
			{
				System.out.print("What was the name of the first Japanese emperor, who ruled around 600 B.C.?");
				answer=in2.nextLine();;
				if (answer.equals("Emperor Jimmu") || answer.equals("jimmu") || answer.equals("Jimmu"))
				{
					System.out.println("Congratualions! You received the Old Textbook! Move to another room!\n");
					setCantMove(false);
					getOccupant().setOldTextbook(true);
				}
						
				else 
				{
					System.out.println("Wrong answer, try again.");
				}
			}
			
			if (Board.getDifficulty()==3)
			{
				System.out.print("Murasaki Shikibu wrote what may have been the world's first novel around 1000 A.D. What was its name?");
				answer=in2.nextLine();;
				if (answer.equals("The Tale of Genji"))
				{
					System.out.println("Congratualions! You received the Old Textbook! Move to another room!\n");
					setCantMove(false);
					getOccupant().setOldTextbook(true);
				}
						
				else 
				{
					System.out.println("Wrong answer, try again.");
				}
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
