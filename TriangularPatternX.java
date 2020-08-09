import java.util.Scanner;
public class TriangularPatternX
{
   public static void main (String []args)
   {
   int row = 0;
   int column = 0;
   int space = 0;
   Scanner scan = new Scanner (System.in);
   System.out.println("Enter the size: ");
   int size = scan.nextInt();
   
   //A
   //rows
   for (row = 1; row <= size; row++){
      //columns
      for (column = 1; column <= row; column++){
         System.out.print(" # ");
         }
      System.out.println();
      }
   
   System.out.println();
   
   //B
   //rows
   for(row = 1; row <= size; row++){
      //column
      for (column = size; column >= row; column--){
         System.out.print(" # ");
         }
      System.out.println();
      }
   
   //C
   //rows
   for(row = 1; row <= size; row++){
      //column
      for(space = 1; space >= row-1; space++){
         System.out.print(" ");
         for (column = size; column >= row; column--){
            System.out.print(" # ");
            }
         }
      System.out.println();
      }

   }
}
         