package prob1;

public class GreenMartianTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testEquals_success();
		testEquals_fail();
		testSpeakAndTeleportAndToString();
		testEqualsRedAndGreen_success();
	}
	private static void testSpeakAndTeleportAndToString() {
		System.out.println("\ntestSpeakAndTeleportAndToString()");
		Martian m1 = new GreenMartian(1,2);
		
		System.out.println("Actual");
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Teleporting = " + ((GreenMartian) m1).teleport(" home"));
		System.out.println("Martian 1 Speak = " + m1.speak());
		
	}
	private static void testEquals_success() {
		System.out.println("\ntestEquals_success()");
		Martian m1 = new GreenMartian(2,3);
		Martian m2 = new GreenMartian(2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
	private static void testEquals_fail() {
		System.out.println("\ntestEquals_fail()");
		Martian m1 = new GreenMartian(1,2);
		Martian m2 = new GreenMartian(2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
	private static void testEqualsRedAndGreen_success() {
		System.out.println("\ntestEqualsRedAndGreen_success()");
		Martian m1 = new GreenMartian(1,2);
		Martian m2 = new RedMartian(1,2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
}

