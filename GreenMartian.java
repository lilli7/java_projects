package prob1;

public class GreenMartian extends Martian implements Teleporter
{

	public GreenMartian(int id, int volume) 
	{
		// TODO Auto-generated constructor stub
		super(id, volume);
	}
	
	public GreenMartian(int id)
	{
		this(1, 1);
	}

	public String teleport(String dest)
	{
		String msg = "id= " + id + " teleporting to" + dest;
		return msg;
	}
	
	public String speak()
	{
		String msg = "id= " + id + ", Grobldy Grock";
		return msg;
	}
	
	@Override
	public String toString()
	{
		String msg = String.format("Green Martian- id= %d, volume= %d ", id, volume);
		return msg;
	}
	
}
