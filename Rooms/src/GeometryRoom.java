import java.util.Scanner;

public class GeometryRoom extends Room 
{
	Person occupant;
	private static boolean cantMove = true;
	
	private int num1;
	private int num2;
	
	public GeometryRoom(int x, int y, int num1,int num2)	{
		super(x,y,false);
		
		this.num1=num1;
		this.num2=num2;
	}
	
	public void enterRoom(Person x)
	{
		num1=(int) (Math.random()*5);
		num2=(int) (Math.random()*5);
		int sum=num1+num2;
		occupant = x;
		x.setxLoc(this.getxLoc());
		x.setyLoc(this.getyLoc());
		
		Scanner in1 = new Scanner(System.in);
		while (cantMove)	
		{
			System.out.println("What is "+num1+" plus "+num2+" ?" );
			int answer=in1.nextInt();
			if (answer == (sum)) 	
			{
				System.out.println("Congratulations, you earned the Geometry Badge!");
				cantMove = false;
				
			if (answer != (sum))	
			{
				System.out.println("please enter a number");
			}
			}
			
		}
		
	}
}

