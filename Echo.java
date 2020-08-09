/*Class: CSE 1321L
Section: 4
Term: Spring 2019
Instructor: Nisha Sharma
Name: Lillibeth Hunter
Lab#: 1*/
import java.util.Scanner; 
public class Echo 
{  
   public static void main (String[] args) 
   { 
      String message; 
      Scanner scan = new Scanner (System.in); 
      System.out.print ("Enter a line of text:"); 
      message = scan.nextLine(); 
      System.out.println ("You entered: \"" + message + "\""); 
   } 
} 

