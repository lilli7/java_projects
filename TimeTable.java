import java.util.Scanner;
public class TimeTable
{
   public static void main (String[]args)
   {
   Scanner scan = new Scanner (System.in);
   //get a number from the user
   System.out.println("Enter a size: ");
   int size = scan.nextInt();
   //rows
   System.out.println(" * | 1 2 3 4 5 6 7 8 9 10");
   for (int dash = 1; dash <= 36; dash++){
      System.out.print("-");}
      System.out.printl();
   for(int row = 1; row <= size; row++){
      //column
      System.out.print(row + " " + " | ");
      for (int column = 1; column <= size; column++){
         System.out.print(row * column);
         System.out.print(" ");
         }
      System.out.println();
      }
   }
}