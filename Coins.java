/*Class: CSE 1321L
Section: 4
Term: Spring 2019
Instructor: Nisha Sharma
Name: Lillibeth Hunter
Lab#: 3*/
import java.util.Scanner;
public class Coins
{
   public static void main (String[] args)
   {
   //declare variables
   int quarters;
   int dimes;
   int nickels;
   int pennies;
   //user input for quarters, dimes, nickles, and pennies
   Scanner scan = new Scanner (System.in);
   System.out.println ("Enter number of quarters: ");
   quarters = scan.nextInt();
   System.out.println ("Enter number of dimes: ");
   dimes = scan.nextInt();
   System.out.println ("Enter number of nickels: ");
   nickels = scan.nextInt();
   System.out.println ("Enter number of pennies: ");
   pennies = scan.nextInt();
   
   System.out.println ("You entered " + quarters + " quarters");
   System.out.println ("You entered " + dimes + " dimes");
   System.out.println ("You entered " + nickels + " nickels");
   System.out.println ("You entered " + pennies + " pennies");
   
   //add value to each quarters, dimes, nickels, and pennies
   int quartValue = quarters * 25;
   int dimeValue = dimes * 10;
   int nickelValue = nickels * 5;
   int pennyValue = pennies * 1;
   
   //add quarters, dimes, nickels, and pennies
   int total = quartValue + dimeValue + nickelValue + pennyValue;
   int totalDollar = total / 100;
   int totalCent = total % 100;
   
   System.out.println ("Your total is " + totalDollar + " Dollars" + " and " + totalCent + " Cents.");
   }
}
   