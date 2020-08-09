package prob1;

public class RedMartianTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testEquals_success();
		testEquals_fail();
		testSpeakAndToString();
	}
	private static void testSpeakAndToString() {
		System.out.println("\ntestSpeakAndToString()");
		Martian m1 = new RedMartian(1,1,2);
		Martian m2 = new RedMartian(1,2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("Martian 1 Speak = " + m1.speak());
		
	}
	private static void testEquals_success() {
		System.out.println("\ntestEquals_success()");
		Martian m1 = new RedMartian(1,1,2);
		Martian m2 = new RedMartian(1,2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
	private static void testEquals_fail() {
		System.out.println("\ntestEquals_fail()");
		Martian m1 = new RedMartian(1,1,2);
		Martian m2 = new RedMartian(2,2,3);
		System.out.println("Martians:");
		System.out.println("Martian 1 = " + m1);
		System.out.println("Martian 2 = " + m2);
		System.out.println("m1.equals(m2) = " + m1.equals(m2));
	}
}


