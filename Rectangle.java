/*Class: CSE 1321L
Section: 4
Term: Spring 2019
Instructor: Nisha Sharma
Name: Lillibeth Hunter
Lab#: 2*/
import java.util.Scanner;
public class Rectangle
{
   public static void main (String[] args)
   {
      System.out.println("Give me the width of the rectangle:");
      Scanner reader = new Scanner (System.in);
      int width = reader.nextInt ();
      System.out.println ("The width= " + width);
      
      System.out.println("Give me the height of the rectangle:");
      int height = reader.nextInt (); 
      System.out.println ("The height= " + height);
      
      int area = (width*height);
      System.out.println("The area= " + area);
      
      int perimeter = (2*width + 2*9height);
      System.out.println("The perimeter= " + perimeter);
   }
}