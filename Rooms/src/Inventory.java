
public class Inventory {
	private int[] space;
	
	public Inventory(int size)
	{
		this.setSpace(new int[size]);
	}

	public int[] getSpace() {
		return space;
	}

	public void setSpace(int[] space) {
		this.space = space;
	}
}
