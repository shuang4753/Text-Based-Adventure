
public class Person {
	private String firstName;
	private String familyName;
	private int xLoc, yLoc;
	private boolean calculator, oldTextbook, derivative;
	
	
	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.calculator=false;
		this.oldTextbook=false;
		this.derivative=false;
	}
	
	
	public int getxLoc() {
		return xLoc;
	}

	public void setxLoc(int xLoc) {
		this.xLoc = xLoc;
	}

	public int getyLoc() {
		return yLoc;
	}

	public void setyLoc(int yLoc) {
		this.yLoc = yLoc;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}


	public boolean isCalculator() {
		return calculator;
	}

	public void setCalculator(boolean calculator) {
		this.calculator = calculator;
	}

	public boolean isOldTextbook() {
		return oldTextbook;
	}

	public void setOldTextbook(boolean oldTextbook) {
		this.oldTextbook = oldTextbook;
	}

	public boolean isDerivative() {
		return derivative;
	}

	public void setDerivative(boolean derivative) {
		this.derivative = derivative;
	}


}
