package prob1;

import java.util.ArrayList;

public class MartianManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testAddMartian();
		testBattle();
		testcontains();
		testgetMartianAt();
		testgetMartianClosestTo();
		testgetMartianWithId();
		testgetNumMartians();
		testgetNumTeleporters();
		testgetSortedMartians();
		testgetTeleporterAt();
		testgroupSpeak();
		testgroupTeleport();
		//testobliterateTeleporters();
		testremoveMartian();
		testtoString();
		
	}
	private static void testAddMartian() {
		System.out.println("testAddMartian()");
		MartianManager mm = new MartianManager();
		System.out.println("Number of Martians = " + mm.getNumMartians());
		mm.addMartian(new RedMartian(1,2,3));
		mm.addMartian(new GreenMartian(2,1));
		System.out.println("Adding 2 = " + mm.getNumMartians());
		System.out.println();
		
	}	
	private static void testBattle() {
		System.out.println("testBattle()");
		ArrayList<Martian> invaders = new ArrayList<>();
		invaders.add(new GreenMartian(1,2));
		invaders.add(new GreenMartian(1,3));
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(1,2,3));
		mm.addMartian(new GreenMartian(2,1));
		System.out.println(mm.battle(invaders));
		System.out.println();
	}
	/*private static void testgetPower() {
		System.out.println("testgetPower()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding Martian");
		mm.addMartian(new RedMartian(1,2,3));
		mm.getPower(null);

	}*/
	private static void testcontains() {
		System.out.println("testcontains()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding Martian");
		mm.addMartian(new RedMartian(1,2,3));
		System.out.println("Searching Martian");
		System.out.println(mm.contains(1));
		System.out.println("Searching nonexistent Martian");
		System.out.println(mm.contains(4));
		System.out.println();
	}
	
	private static void testgetMartianAt() {
		System.out.println("testgetMartianAt()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding Martian");
		mm.addMartian(new RedMartian(1,2,3));
		System.out.println("Searching martian in first spot");
		System.out.println(mm.getMartianAt(0));
//		System.out.println("Searching martian in nonexistent spot");
//		System.out.println(mm.getMartianAt(5));
		System.out.println();
	}
	private static void testgetMartianClosestTo() {
		System.out.println("testgetMartianClosestTo()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(1,2,3));
		mm.addMartian(new GreenMartian(2,3));
		mm.addMartian(new RedMartian(4,5,6));
		mm.addMartian(new GreenMartian(6,7));
		System.out.println(mm.getMartianClosestTo(5));
		System.out.println(mm);
		System.out.println();
	}
	private static void testgetMartianWithId() {
		System.out.println("testgetMartianWithId()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding Red and Green Martian ");
		mm.addMartian(new RedMartian(1,2,3));
		mm.addMartian(new GreenMartian(2,3));
		System.out.println("Searching Red Martians id");
		System.out.println(mm.getMartianWithId(1));
		System.out.println("Searching Green Martians id");
		System.out.println(mm.getMartianWithId(2));
		System.out.println();
	}
	private static void testgetNumMartians() {
		System.out.println("testgetNumMartians()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding Martian");
		mm.addMartian(new RedMartian(1,2,3));
		System.out.println(mm.getNumMartians());
		System.out.println("Adding 2 more Martians");
		mm.addMartian(new RedMartian(5,2,3));
		mm.addMartian(new RedMartian(4,2,3));
		System.out.println(mm.getNumMartians());
		System.out.println();
	}
	private static void testgetNumTeleporters() {
		System.out.println("testgetNumTeleporters()");
		MartianManager mm = new MartianManager();
		System.out.println("Num teleporters before teleporting");
		GreenMartian gm = new GreenMartian(1,3);
		mm.addMartian(gm);
		System.out.println(mm.getNumTeleporters());
		System.out.println("Num teleporters after teleporting 1 martian");
		System.out.println(gm.teleport("Mars"));
		mm.removeMartian(gm.getId());
		System.out.println(mm.getNumTeleporters());
		System.out.println();
	}
	private static void testgetSortedMartians() {
		System.out.println("testgetSortedMartians()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new RedMartian(5,2,3));
		mm.addMartian(new RedMartian(6,2,3));
		mm.addMartian(new GreenMartian(4,9));
		System.out.println("Martians:");
		System.out.println(mm);
		
		ArrayList<Martian> sorted = mm.getSortedMartians();
		System.out.println("\nMartians returned from p.getSortedMartians():");
		for(Martian m : sorted) {
			System.out.println(m);
		}

		System.out.println("\nMartians after sort:");
		System.out.println(mm);
		System.out.println();
	}
	private static void testgetTeleporterAt() {
		System.out.println("testgetTeleporterAt()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new RedMartian(5,2,3));
		mm.addMartian(new RedMartian(6,2,3));
		mm.addMartian(new GreenMartian(4,9));
		System.out.println(mm.getTeleporterAt(0));
		System.out.println();
	}
	private static void testgroupSpeak() {
		System.out.println("testgroupSpeak()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new GreenMartian(2,3));
		System.out.println("Adding 2 Martians Red and Green");
		System.out.println(mm.groupSpeak());
		System.out.println();
	}
	private static void testgroupTeleport() {
		System.out.println("testgroupTeleport()");
		MartianManager mm = new MartianManager();
		GreenMartian gm = new GreenMartian(1,3);
		mm.addMartian(gm);
		gm.teleport("Mars");
		System.out.println(mm.groupTeleport("MARS"));
		System.out.println();
	}
	private static void testobliterateTeleporters() {
		System.out.println("testobliterateTeleporters()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new RedMartian(5,2,3));
		mm.addMartian(new RedMartian(6,2,3));
		mm.addMartian(new GreenMartian(4,9));
		System.out.println(mm);
		mm.obliterateTeleporters();
		System.out.println(mm);
		System.out.println();
	}
	private static void testremoveMartian() {
		System.out.println("testremoveMartian()");
		MartianManager mm = new MartianManager();
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new RedMartian(5,2,3));
		System.out.println("Adding 2 Martians");
		System.out.println("Number of martians = " + mm.getNumMartians());
		mm.removeMartian(5);
		System.out.println("Removing 1 Martian ");
		System.out.println("Remaining Martian = " + mm.getNumMartians());
		System.out.println();
	}
	private static void testtoString() {
		System.out.println("testtoString()");
		MartianManager mm = new MartianManager();
		System.out.println("Adding 2 Martians Red and Green");
		mm.addMartian(new RedMartian(9,2,3));
		mm.addMartian(new GreenMartian(2,3));
		System.out.println(mm.toString());
		System.out.println("Removing Green Martian\n");
		mm.removeMartian(2);
		System.out.println(mm.toString());
		System.out.println();
	}
}


