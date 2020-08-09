package prob1;

public class RedMartian extends Martian 
{

	private int tenacity;
	
	public RedMartian(int id, int volume, int tenacity) 
	{
		super(id, volume);
		this.tenacity = tenacity;
	}
	
	public RedMartian(int id, int tenacity) 
	{
		// TODO Auto-generated constructor stub
		this(1,1,1);
	}

	public int getTenacity()
	{
		return tenacity;
	}
	
	public String speak()
	{
		return "id= " + id + ", Rubdly Rock";
	}
	
	@Override
	public String toString()
	{
		String msg = String.format("Red Martian- id= %d, vol= %d, ten= %d", id, volume, tenacity);
		return msg;
	}
}
