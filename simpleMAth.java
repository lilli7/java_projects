/*Class: CSE 1321L
Section: 4
Term: Spring 2019
Instructor: Nisha Sharma
Name: Lillibeth Hunter
Lab#: 3*/
import java.util.Scanner;
public class simpleMAth
{
   public static void main (String[]args)
   {
   //Take input
   Scanner scan = new Scanner (System.in);
   //Declare float variables
   float R;
   float T;
   //input of R
   System.out.println ("Enter R");
   R = scan.nextFloat(); 
   System.out.println ("R = " + R);
   //input of T
   System.out.println ("Enter T");
   T = scan.nextFloat(); 
   System.out.println ("T = " + T);
   
   //Add R and T
   float RaddT = R + T;
   System.out.println (" R + T = " + RaddT);
   
   //Subtract R and T
   float RsubT = R - T;
   System.out.println (" R - T = " + RsubT);
   
   //Multiply R and T
   float RmulT = R * T;
   System.out.println ("R * T = " + RmulT);
   }
}
   
