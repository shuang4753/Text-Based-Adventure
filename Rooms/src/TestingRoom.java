import java.util.Scanner;

public class TestingRoom extends Room {
	

	
	public TestingRoom(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {

		setOccupant(x);
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		Scanner test = new Scanner(System.in);
		String answer1="2x";
		String answer2="123";
		String answer3="Thomas Woodrow Wilson";
		String answer4="Wilson";
		
		if (getOccupant().isCalculator()==true && getOccupant().isDerivative()==true && getOccupant().isOldTextbook()==true )
		{
			System.out.println("You found the Testing Room. Time to test your knowledge using your tools.\n"
					+ "What is the derivative of x squared?");
			if (answer1.equals(test.nextLine()))
			{
				System.out.println("Good... it seems you know your calculus. Next question! \n"
						+ "What is 12*10+3?");
			}
				if (answer2.equals(test.nextLine()))
				{
					System.out.println("Amazing! You are almost about to graduate! \n"
							+ "The final question: who was America's 28th president?");
				}
					if (answer3.equals(test.nextLine()) || answer4.equals(test.nextLine()))
					{
						System.out.println("Congratulations!!! You graduated high school! :) Time to move on to bigger things.");
					}
					//Runner.gameOff();
		}
		
		else
		{
			System.out.println("Sorry, you do not have the adequate intellect to proceed testing. Please leave the room and learn more.");
		}
		
		Runner.gameOff();
	}
	
	public void print () {
		if (!isExplored())
		{
			System.out.print("[T]");
		}
	}

}
