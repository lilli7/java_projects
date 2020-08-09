package prob1;

public class Employee 
{
	private double[] hours;
	private String name;
	private double payRate;
	 
	public Employee(String name, double payRate)
	{
		this.name = name;
		this.payRate = payRate;
		this.hours = new double[7];
	}
	
	public double getHours(int day) 
	{
		//How should I go about this??/ Is this right?*** NEED HELP
		//
		
		for(day = 0; day <= 6; day++)
		{
			return hours[day];
		}
		
		return -1;
	}
	 
	public String getName() 
	{
		return name;
	}
	
	public int getNumDaysWorked() 
	{
		int day = 0;
		for(int i = 0; i < hours.length; i++)
		{
			if(hours[i] >0)
			{
				day++;
			}
		}
		return day;
		
	}
	
	public double getPay() 
	{
		double pay = 0;
		if(getWeekdayHours() <= 40)
		{
			pay += (getWeekdayHours()*payRate);
		}
		else if(getWeekdayHours() > 40) 
		{
			pay += (40*payRate);
			pay += ((1.5 * payRate) * (getWeekdayHours() - 40));
		}
		if (getWeekendHours() > 0)
		{
			pay += ((2 * payRate) * getWeekendHours());
		}
		//if employee works all 7days + 50$
		if(getNumDaysWorked() == 7)
		{
			pay += 50.0;
		}
		
		return pay;
	}
	
	public double getPayRate() 
	{
		return payRate;
	}
	
	
	public double getTotalHours() 
	{
		return (getWeekdayHours() + getWeekendHours());
	}
	
	public double getWeekdayHours() 
	{
		double total = 0.0;
		for(int i = 0; i < 5; i++) 
		{
			total += hours[i];
		}
		return total;
	}
	
	public double getWeekendHours() 
	{
		double sum = 0.0;
		for(int i = 5; i <= 6; i++) 
		{
			sum += hours[i];
		}
		return sum;
	}
	
	
	public void hours(double[] hours) 
	{
		this.hours = hours;
	}

	public void payRate(double payRate) 
	{
		this.payRate = payRate;
	}

	
	public void mergeEmployee(Employee e) 
	{
		
		//double[] result = new double[hours.length];
		for(int i = 0; i < hours.length; i++) 
		{
			hours[i] = hours[i] + e.hours[i];
		}
		
	}
	
	public void newWeek() 
	{
		for (int i = 0; i < hours.length; i++)
		{
			hours[i] = 0;
		}
	}
	public void setHours(int day, double hours) 
	{
		this.hours[day]=hours;
	}

	@Override
	public String toString() 
	{
		return "Pay Stub" + 
				"\n -------------" +
				String.format("\nName:%s, PayRate:%.2f" , name, payRate) +
				String.format("\nMon:%.2f, Tues:%.2f, Wed:%.2f, Thurs%.2f, Fri%.2f, Sat%.2f, Sun%.2f", hours[0], hours[1], hours[2], hours[3], hours[4], hours[5], hours[6])
				+String.format("\nDays Worked:%d, Total Hours:%.2f", getNumDaysWorked(), getTotalHours())
				+String.format("\nWeekday Hours:%.2f, Weekend Hours%.2f", getWeekdayHours(), getWeekendHours())
				+String.format("\nTotal Pay:%.2f ", getPay());
	}

	public static void main(String[] args) {

	}

}
