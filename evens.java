import java.util.Scanner;
public class evens
{
   public static void main (String[]args)
   {
   //collect stopping point
   Scanner scan = new Scanner (System.in);
   System.out.println ("Give me a stopping point: ");
   int stoppt = scan.nextInt();
   System.out.println ("Stopping point: " + stoppt);
   
   int sum = 0;
   for (int i = 0; i <= stoppt; i++)
   {
      if (i % 2 == 0)
      {
         System.out.println ( i );
         sum = (i + sum);
         }
      }
     System.out.println ("Sum of all evens: " + sum);
   }
}
   