import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticRoom extends Room 
{
	//private Person occupant;
	private int num1;
	private int num2;
	

	
	public ArithmeticRoom(int x, int y, int difficulty, int num1,int num2)	{
		super(x,y,0);
		this.num1=num1;
		this.num2=num2;
		
	}
	
	public void enterRoom(Person x)
	{
		
		setOccupant(x);
		this.setExplored(true);
		num1=(int) (Math.random()*5);
		num2=(int) (Math.random()*5);
		int sum=num1+num2;
		int product=num1*num2;
		int hardquestion=num1/(num2*(num1/2+num2/2));
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		int answer=0;
		
		
		Scanner in1 = new Scanner(System.in);
		while (isCantMove())	
		{
			if (Board.getDifficulty()==1) 
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
					System.out.println("Congratulations, you earned a Calculator! Move to another room!\n");
					getOccupant().setCalculator(true);
					setCantMove(false);
				}
			
			}
			
			
			if (Board.getDifficulty()==2) 
			{
				System.out.println("What is "+num1+" times "+num2+"?" );
				try 
				{
					answer=in1.nextInt();	
				}
				catch (InputMismatchException e)
				{
					in1.next();
					System.out.print("That's not an interger. Try again. \n");
				}
			
				if (answer == (product)) 	
				{
					System.out.println("Congratulations, you earned a Calculator! Move to another room!\n");
					getOccupant().setCalculator(true);
					setCantMove(false);
				}
			}
			
			
			if (Board.getDifficulty()==3) 
			{
				System.out.println("What is " + num1 + "/(" + num2 + "(" + num1/2 + "+" + num2/2 + "))" );
				try 
				{
					answer=in1.nextInt();	
				}
				catch (InputMismatchException e)
				{
					in1.next();
					System.out.print("That's not an interger. Try again. \n");
				}
			
				if (answer == (hardquestion)) 	
				{
					System.out.println("Congratulations, you earned a Calculator! Move to another room!\n");
					getOccupant().setCalculator(true);
					setCantMove(false);
				}
			}
		}
	}
	public void print()
	{
		if (!isExplored())
		{
			System.out.print("[A]");
		}
	
		else
		{
			System.out.print("[A]");
		}
	}

	
}

