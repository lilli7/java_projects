/*Class: CSE 1321L
Section: 4
Term: Spring 2019
Instructor: Nisha Sharma
Name: Lillibeth Hunter
Lab#: 3*/
import java.util.Scanner;
public class sumValue
{
   public static void main (String[] args)
   {
   //Variables X, Y, and Z
   float X;
   float Y;
   float Z;
   //Take user input
   Scanner scan = new Scanner (System.in);
   //user input for x
   System.out.println ("Enter X");
   X = scan.nextInt();
   System.out.println ("X = " + X);
   //user input for y
   System.out.println ("Enter Y");
   Y = scan.nextInt();
   System.out.println ("Y = " + Y);
   //user input for z
   System.out.println ("Enter Z");
   Z = scan.nextInt();
   System.out.println ("Z = " + Z);
   
   //Add X, Y, and Z and divide by 3.0
   double total = (double)(X + Y + Z)/3.0;
   
   //average
   System.out.println("Average = " + total);
   }
}
