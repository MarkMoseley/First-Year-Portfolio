import java.util.Scanner;

/** Description:
     
     This program creates an isosceles triangle or "tree" based on a height given
     by the user. The tree is composed of '*' characters.
     
     */

public class MakeATree{

   public static void main (String [] args){
      
      //Sets up the Scanner Object
      Scanner kbd = new Scanner(System.in);
   
      //Give out instructions to the user
      System.out.println("This program will make a tree of \"*'s\" based on a given height.\n");
      
      //Ask for the height of the tree
      System.out.print("Please enter an integer value greater than one for the height of the tree: ");
      
      //Save the height of the tree as a double
      double height = kbd.nextDouble();
      System.out.println();
         
         //Test to make sure only a valid integer for height is entered
         while(height <= 1){
            System.out.print("Please enter an integer value GREATER than one for the height of the tree: ");
            height=kbd.nextDouble();
            System.out.println();
         }
         
         //Test to make sure only an integer has been entered
         while(height%1 != 0){
            System.out.print("Please enter only an INTEGER value greater than one for the height of the tree: ");
            height=kbd.nextDouble();
            System.out.println();
         }

      //Draw the tree
      
      //controls which line of the tree is being worked upon
      for( int i = 1; i <= height; i++){
         
         //controls the amount of spaces
         for( int j = 1; j<= height -i; j++)
            System.out.print(" ");
         
         //controls the amount of characters
         for( int j =1; j<=i ; j++){
            System.out.print("* ");
         }
            
      //Moves the cursor down
      System.out.println();
      }
   
   //End Main
   }
}
