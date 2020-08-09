package prob1;

public class Car 
{
	private double fuelCapacity;
	private double fuelEfficiency;
	private double fuelLevel;
	private double totalDistance;
	
	Car(double fuelCapacity, double fuelEfficiency) 
	{
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	Car(double fuelCapacity, double fuelEfficiency, double fuelLevel)
	{
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = fuelLevel;
	}
	
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public double getTotalDistance() {
		return totalDistance;
	}
	
	public void drive(double time, double rate)
	{
		double distance = time*rate;
		double fuelNeeded = distance / fuelEfficiency;
		if (fuelLevel >= fuelNeeded) //this condition might be the problem
		{
			//this part is good
			totalDistance += distance;
			fuelLevel -= (distance / fuelEfficiency);
		}
		else {
			//fuelEfficiency * gallons can do
			distance = fuelLevel * fuelEfficiency;
			//set fuel level to 0
			fuelLevel = 0.0;
			//add the previous to distance
			totalDistance += distance;
		}
	}
	
	public void fillUp(double amount)
	{
		double remainingCapacity = fuelCapacity - fuelLevel;
		if(amount < remainingCapacity)
		{
			fuelLevel += amount;
		}
		
		else if(amount == remainingCapacity)
		{
			fuelLevel += amount;
		}
		
		else if (amount > remainingCapacity && remainingCapacity != 0) 
		{
			fuelLevel += remainingCapacity;
		}
		
	}
	
	@Override
	public String toString()
	{
		return String.format("FuelLevel=%.1f, totalDistance=%.1f, fuelCapacity=%.1f, fuelEfficiency=%.1f", fuelLevel, totalDistance, fuelCapacity, fuelEfficiency);
	}

}
