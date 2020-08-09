package prob1;

public class Product 
{
	private int batch;
	private String code;
	private String date;
	private int indexDateBegins;
	private String plant;
	
	public Product(String code) 
	{
		this.code = code;
		this.batch = extractBatch();
		this.plant = extractPlant();
		this.date = extractDate();
	}
	private int extractBatch() 
	{
		if(Character.isDigit(code.charAt(2))) 
		{
			batch = Integer.parseInt(code.substring(10));
		}	
		else 
		{
			batch = Integer.parseInt(code.substring(11));
		}
		return batch;
	}
	private String extractPlant() 
	{
		if(Character.isDigit(code.charAt(2))) 
		{
			plant = code.substring(0,2);
			indexDateBegins = 2;
		}
		else if (Character.isLetter(code.charAt(2)))
		{
			plant = code.substring(0,3);
			indexDateBegins = 3;
		}
		return plant;
	}
	private String extractDate() 
	{
		if(Character.isDigit(code.charAt(2))) 
		{
			//plant = code.substring(0,2);
			indexDateBegins = 2;
			date = code.substring(indexDateBegins,10);
		}
		else 
		{
			indexDateBegins = 3;
			date = code.substring(indexDateBegins,11);
		}
		String month = date.substring(0,2);
		String day = date.substring(2,4);
		String year = date.substring(4);
		date = month + "/" + day + "/" + year;
		return date;
	}
	public int getBatch() 
	{
		return batch;
	}
	public String getCode() 
	{
		return code;
	}
	public String getDate() 
	{
		return date;
	}
	public String getPlant() 
	{
		return plant;
	}
	public boolean isAfter2000() 
	{
		
		int year = Integer.parseInt(date.substring(6));
		if (year>=2000) 
		{
			return true;
		}
		return false;
		
	}
	public boolean isMonthEqual(int month) 
	{
		if(month==Integer.parseInt(date.substring(0,2))) 
		{
			return true;
		}
		
		return false;
		
	}
	public String toString() 
	{
		return String.format("code = %s, plant = %s, date = %s, batch = %d", code,plant,date,batch);
	}

}
