package prob1;

public class EmployeeUtilities 
{
	public EmployeeUtilities() 
	{
		
	}
	
	
	public Employee getEmployeeWithMostHours(Employee[] emps) {
		int max = 0;
		for (int i = 0;i<=emps.length;i++) 
		{
			if (emps[i].getTotalHours() > emps[max].getTotalHours()) 
			{
				 max = i;
				 return emps[max];
			}
		}
		return emps[max];
	}
	
	public double[] getHoursArray(Employee[] emps) 
	{
		
		double[] hours = new double[emps.length];
		for (int i = 0;i<emps.length;i++) 
		{
			hours[i] = emps[i].getTotalHours();
		}
		return hours;
	}
	
	public double getTotalPay(Employee[] emps) {
		double totPay = 0;
		for (int i = 0;i<=emps.length-1;i++) {
			totPay += emps[i].getPay();
		
		}
		return totPay;
	}

}
