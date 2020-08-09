package prob1;

public class ProductTest {

	public static void main(String[] args) {
		testProductConstructor_Plant_3chars_Batch_2chars();
		testProductConstructor_Plant_3chars_Batch_1chars();
		testProductConstructor_Plant_2chars_Batch_2chars();
		testProductConstructor_Plant_2chars_Batch_1chars();
		testIsAfter2000Test_True_Year2019();
		testIsAfter2000Test_True_Year2000();
		testIsAfter2000Test_False_Year1994();
		testIsMonthEqual_True();
		testIsMonthEqual_False();
	}
	
	public static void testProductConstructor_Plant_3chars_Batch_2chars() {
		System.out.println("-->testProductConstructor_Plant_3chars_Batch_2chars()");
		System.out.println("Expected: code=VLD0404193682, plant=VLD, date=04/04/1936, batch=82");
		Product p = new Product("VLD0404193682");
		System.out.println("  Actual: " + p);
	}

	public static void testProductConstructor_Plant_3chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_3chars_Batch_1chars()");
		System.out.println("Expected: code=VLD040419362, plant=VLD, date=04/04/1936, batch=2");
		Product p = new Product("VLD040419362");
		System.out.println("  Actual: " + p);
	}

	public static void testProductConstructor_Plant_2chars_Batch_2chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_2chars()");
		System.out.println("Expected: code=SF0404193643, plant=SF, date=04/04/1936, batch=43");
		Product p = new Product("SF0404193643");
		System.out.println("  Actual: " + p);
	}

	public static void testProductConstructor_Plant_2chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_1chars()");
		System.out.println("Expected: code=SF040419368, plant=SF, date=04/04/1936, batch=8");
		Product p = new Product("SF040419368");
		System.out.println("  Actual: " + p);
	}

	public static void testIsAfter2000Test_True_Year2019() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2019()");
		// year>2000
		printIsAfter2000(new Product("SF0404201943"));
	}

	public static void testIsAfter2000Test_True_Year2000() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2000()");
		// year=2000
		printIsAfter2000(new Product("VLD040420007"));
	}

	public static void testIsAfter2000Test_False_Year1994() {
		System.out.println("\n-->testIsAfter2000Test_False_Year1994()");
		// year<2000
		printIsAfter2000(new Product("VLD0404199482"));
	}

	private static void printIsAfter2000(Product p) {
		String msg = String.format("date=%s>=2000 = %b", p.getDate(), p.isAfter2000());
		System.out.println(msg);
	}

	public static void testIsMonthEqual_True() {
		System.out.println("\n-->testIsMonthEqual_True()");
		// year<2000
		printIsMonthEqual(new Product("VLD0404199482"), 4);
	}

	public static void testIsMonthEqual_False() {
		System.out.println("\n-->testIsMonthEqual_False()");
		// year<2000
		printIsMonthEqual(new Product("VLD0404199482"), 8);
	}

	private static void printIsMonthEqual(Product p, int mon) {
		boolean isEqual = p.isMonthEqual(mon);
		String msg = String.format("date=%s, p.isMonthEqual(%d)=%b", p.getDate(), mon, isEqual);
		System.out.println(msg);
	}

}
