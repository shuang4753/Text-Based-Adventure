import java.util.Scanner;

public class TestingRoom extends Room {
	

	
	public TestingRoom(int x, int y, int difficulty) {
		super(x, y,0);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void enterRoom(Person x) {

		setOccupant(x);
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		Scanner test = new Scanner(System.in);
		if (getOccupant().isCalculator()==true && getOccupant().isDerivative()==true && getOccupant().isOldTextbook()==true )
		{
			System.out.println("You found the Testing Room. Time to test your knowledge using your tools.\n");
					
			if (Board.getDifficulty()==1)
			{
				System.out.println("What is the derivative of x squared?");
				if ("2x".equals(test.nextLine()))
				{
					System.out.println("Good... it seems you know your calculus. Next question! \n"
					+ "What is 12*10+3?");
				}
					if ("123".equals(test.nextLine()))
					{
						System.out.println("Amazing! You are almost about to graduate! \n"
						+ "The final question: who was America's 1st president?");
					}
						if ("George Washington".equals(test.nextLine()) || "Washington".equals(test.nextLine()))
						{
							System.out.println("Congratulations!!! You graduated high school! :) Time to move on to bigger things.");
							Runner.gameOff();
						}
			
							else
							{
								System.out.println("\nSorry, you do not have the adequate intellect to proceed testing. Please leave the room and learn more.");
							}
			}
			
			if (Board.getDifficulty()==2)
			{
				System.out.println("What is the derivative of 1/(x^2)?");
				if ("-2/(x^3)".equals(test.nextLine()) || "-2*(x^-3)".equals(test.nextLine()))
				{
					System.out.println("Good... it seems you know your calculus. Next question! \n"
					+ "What are the factors of the polynomial (x^2 - 1)?"
					+ "Leave your answers in product form.");
				}
					if ("(x-1)(x+1)".equals(test.nextLine()) || "(x+1)(x-1)".equals(test.nextLine()))
					{
						System.out.println("Amazing! You are almost about to graduate! \n"
						+ "The final question: who was America's 16th president?");
					}
						if ("Abraham Lincoln".equals(test.nextLine()) || "Lincoln".equals(test.nextLine()))
						{
							System.out.println("Congratulations!!! You graduated high school! :) Time to move on to bigger things.");
							Runner.gameOff();
						}
			
							else
							{
								System.out.println("\nSorry, you do not have the adequate intellect to proceed testing. Please leave the room and learn more.");
							}
			}
			
			if (Board.getDifficulty()==3)
			{
				System.out.println("What is the derivative of ln(cos(sin(x)))");
				if ("-cos(x)tan(sin(x))".equals(test.nextLine()) || "-tan(sin(x))cos(x)".equals(test.nextLine()) || "-tan(sin(x))*cos(x)".equals(test.nextLine()) || "-cos(x)*tan(sin(x))".equals(test.nextLine()))
				{
					System.out.println("Good... it seems you know your calculus. Next question! \n"
					+ "What are the factors of the polynomial (6x^2 - 11x + 4)?"
					+ "Leave your answer in product form.");
				}
					if ("(2x-1)(3x-4)".equals(test.nextLine()) || "(3x-4)(2x-1)".equals(test.nextLine()))
					{
						System.out.println("Amazing! You are almost about to graduate! \n"
						+ "The final question: which American president did not serve in the military?");
					}
						if ("Donald Trump".equals(test.nextLine()) || "Trump".equals(test.nextLine()) || "Donald J. Trump".equals(test.nextLine()))
						{
							System.out.println("Congratulations!!! You graduated high school! :) Time to move on to bigger things.");
							Runner.gameOff();
						}
			
							else
							{
								System.out.println("\nSorry, you do not have the adequate intellect to proceed testing. Please leave the room and learn more.");
							}
			}
		}		
		
	}
	
	public void print () {
		if (!isExplored())
		{
			System.out.print("[T]");
		}
	}

}
