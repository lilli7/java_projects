package prob1;

public class BasketballPlayer 
{
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private int threePointersAttempted;
	private int threePointersMade;
	private int twoPointersAttempted;
	private int twoPointersMade;
	
	BasketballPlayer(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getFreeThrowsAttempted()
	{
		return freeThrowsAttempted;
	}
	
	public int getFreeThrowsMade()
	{
		return freeThrowsMade;
	}
	
	public void shootFreeThrow(boolean isMade)
	{
		freeThrowsAttempted++;
		if (isMade)
		{
			freeThrowsMade++;
		}
	}
	
	// (made/attempted)*100
	//may need to add percent variable****
	public double getFreeThrowPercent()
	{
		return ((double)freeThrowsMade/(double)freeThrowsAttempted)*100.0;
	}
	
	public int getThreePointersAttempted()
	{
		return threePointersAttempted;
	}
	
	public int getThreePointersMade()
	{
		return threePointersMade;
	}
	
	public void shootThreePointer(boolean isMade)
	{
		threePointersAttempted++;
		if (isMade == true)
		{
			threePointersMade++;
		}
	}
	// (made/attempted)*100
	public double getThreePointerPercent()
	{
		return ((double)threePointersMade/(double)threePointersAttempted)*100.0;
	}
	
	
	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	}

	public int getTwoPointersMade() {
		return twoPointersMade;
	}
	
	public void shootTwoPointer(boolean isMade)
	{
		twoPointersAttempted++;
		if (isMade == true)
		{
			twoPointersMade++;
		}
	}
	
	public double getTwoPointerPercent()
	{
		return ((double)twoPointersMade/(double)twoPointersAttempted)*100.0;
	}
	
	public int getTotalPoints() {
		return (freeThrowsMade + threePointersMade*3 + twoPointersMade*2);
	}
	
	
	
	//percent does not WORK***
	@Override
	public String toString()
	{
		return "Player:" + name + "\tPoints:" + getTotalPoints()
		+ "\nFree Throws: " + String.format("made=%d, attempted=%d, percent=%.2f", freeThrowsMade, freeThrowsAttempted, getFreeThrowPercent()) +
		"\n2 Pointers: "  + String.format("made=%d, attempted=%d, percent=%.2f", twoPointersMade, twoPointersAttempted, getTwoPointerPercent())
		+"\n3 Pointers: " + String.format("made=%d, attempted=%d, percent=%.2f", threePointersMade, threePointersAttempted, getThreePointerPercent());

	}
}
