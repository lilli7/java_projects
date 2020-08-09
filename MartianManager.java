package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MartianManager
{
	protected Map<Martian,Integer> martians = new HashMap<>();
	protected Map<Martian,Integer> teleporters = new HashMap<>();
	
	MartianManager(){}
	
	public boolean addMartian(Martian m)
	{
		if(!martians.containsKey(m))
		{
			martians.put(m,m.getId());
			if(m instanceof Teleporter)
				{
				teleporters.put(m,m.getId());
				}
			return true;
		}		
		return false;
	}
	
	public ArrayList<Martian> battle(ArrayList<Martian> invaders)
	{
		ArrayList<Martian> deadMartians = new ArrayList<>();
		
			//make sure i doesn't repeat again
			for(Martian m : martians.keySet())
			{
				for(Martian i : invaders)
				{
				if(getPower(i) > getPower(m))
				{
					//Martian k = removeMartian(m.getId());
					deadMartians.add(m);
					break;
				}
			}
		}
		return deadMartians;
	}
	
	private int getPower(Martian m)
	{
		int power;
		power = m.getVolume();
		if(m instanceof RedMartian)
		{
			power = m.getVolume() + ((RedMartian) m).getTenacity();
		}
		
		return power;
	}
	
	public boolean contains(int id)
	{
		for(Martian m : martians.keySet())
		{
			if(m.getId() == id)
			{
				return true;
			}
		}

			return false;
	}
	
	
	public Martian getMartianClosestTo(int id)
	{
		int diff;
		int pos = 0;

		diff = Math.abs(martians.get(0).getId()-id);
		
		for(int i = 1; i < martians.size(); i++)
		{
			if((martians.get(i).getId() - id) < diff)
			{
				diff = martians.get(i).getId() - id;
				pos = i;
			}
		}
		return getMartian(pos);
	}
	
	public Martian getMartianClosestTo(Martian martian)
	{
		int diff;
		int pos = 0;

		diff = Math.abs(martians.keySet().get(0).getId()- martian.getId());
		
		for(int i = 1; i < martians.keySet().size(); i++)
		{
			if((martians.keySet().get(i).getId() - martian.getId()) < diff)
			{
				diff = martians.keySet().get(i).getId() - martian.getId();
				pos = i;
			}
		}
		return getMartian(pos);
	}
	
	public Martian getMartian(int id)
	{
		if (martians.keySet().containsKey(id)) {
			return martians.keySet().get(id);
		}
		int diff;
		int pos = 0;

		diff = Math.abs(martians.keySet().get(0).getId()-id);
		
		for(int i = 1; i < martians.keySet().size(); i++)
		{
			if((martians.keySet().get(i).getId() - id) < diff)
			{
				diff = martians.keySet().get(i).getId() - id;
				pos = i;
			}
		}
		return getMartian(pos);
	}
	
	public int getNumMartians()
	{
		return martians.keySet().size();
	}
	
	public int getNumTeleporters()
	{
		return teleporters.size();
	}
	
	/***
	 * Returns a sorted list of martians using the Comparator specified by 
	 * sortType
	 * @param sortType The type of sort to do. Valid values are "ID" and
	 * "VOLUME"
	 * @return Sorted list of Martians either by ID or VOLUME.
	 */
	public ArrayList<Martian> getSortedMartiansSpring2020(String sortType) {
		MartianIdComparator mIdC = new MartianIdComparator();
		
		if(sortType==sortType.ID) {
			ArrayList<Martian> m = new ArrayList<>(martians.keySet());
			
			Collections.sort(m, mIdC);
			return m;
		}
		else if(sT==sortType.VOLUME) {
			ArrayList<Martian> m = new ArrayList<>(martians.keySet());
			MartianVolumeComparator mvc = new MartianVolumeComparator();
			Collections.sort(m, mv);
			return m;
			
		}
	}
	
	public Teleporter getTeleporterAt(int id)
	{
		return teleporters.get(id);
	}
	
	public String groupSpeak()
	{
		String msg = " ";
		for(Martian m : martians.keySet())
		{
			msg += m.speak() + "\n";
		}
		return msg;
	}

	public String groupTeleport(String dest)
	{
		String msg = " ";
		for(Martian m : martians.keySet())
		{
			if(m instanceof Teleporter)
			{
			msg += ((Teleporter) m).teleport(dest) + "\n";
			}
		}
		return msg;
	}
	
	public void obliterateTeleporters()
	{
		teleporters.clear();
	}
	
	public Martian removeMartian(int id)
	{
		for(Martian m : martians.keySet())
		{
			if(m instanceof Teleporter)
			{
				if(m.equals(id))
				{
					martians.keySet().remove(m);
					return m;
				}
			}
		}
		
		for(Teleporter t : teleporters)
		{
			if(t instanceof Teleporter)
			{
				if(t.equals(id))
				{
					teleporters.remove(t);
				}
			}
		}
		return null;
	
	}
	
	public String toString()
	{
		String msg = " ";
		
		msg += ("Martians: " + groupSpeak());
		msg += "Teleporters";
		
		for(Martian m : martians.keySet())
		{
			if(m instanceof Teleporter)
			{
				msg += m.speak();
			}
		}

		return msg;
	}
}


