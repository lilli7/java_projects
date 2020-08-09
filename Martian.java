package prob1;

//import prob1.Item;

public abstract class Martian implements Comparable<Martian>
{

	protected int id;
	protected int volume;
	
	
	public Martian(int id, int volume) 
	{
		// TODO Auto-generated constructor stub
		this.id = id;
		this.volume = volume;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Martian)
		{
			Martian m = (Martian)o;
			if(this.getId() == m.getId())
			{
				return true;
			}
			
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public void setVolume(int volume)
	{
		this.volume = volume;
	}
	
	public abstract String speak();
	
	public int compareTo(Martian m)
	{
		int diff = getId() - m.getId();
		if (diff > 0)
		{
			return 1;
		}
		
		else if(diff < 0)
		{
			return -1;
		}
		
		else return 0;
	}

	@Override
	public String toString()
	{
		String msg = String.format("id=%d, volume=%d", id, volume);
		return msg;
	}
	
	
}
