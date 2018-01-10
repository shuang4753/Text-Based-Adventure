import java.util.InputMismatchException;
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
		String answer="2x";
		
		if (getOccupant().isCalculator()==true && getOccupant().isDerivative()==true && getOccupant().isOldTextbook()==true )
		{
			System.out.println("You found the Testing Room. Time to test your knowledge using your tools.\n"
					+ "What is the derivative of x squared?");
				answer= test.nextLine();
		}
			
		
		Runner.gameOff();
	}
	

}
