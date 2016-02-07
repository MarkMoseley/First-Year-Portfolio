import java.util.Scanner;

/**
                                         
    Description: This program generates two 3x3 matrices and       
                 fills them with random numbers. It then multiplies
                 the two matrices and outputs the product.        
                 
                  */
   

public class MultiplyRandomMatrices 
{
    public static void main (String [] args){
      
      //informs the user of what the program does
      System.out.println("This program generates two 3x3 matrices and then "
                        +"fill them with random numbers.\nIt then multiplies "
                        +"the two matrices together and outputs the product.\n");
     
                        
      //Create the two 3x3 matrices to be multiplied  
      int [][] matrixOne = new int [3][3];
      
      int [][] matrixTwo = new int [3][3];
      
      //Fill the matrices with random numbers
      FillMatrixRandomNumbers (matrixOne);
      FillMatrixRandomNumbers (matrixTwo);
      
      //Reads out the matrix to the user
      PrintMatrix(matrixOne);
      System.out.println("");
      PrintMatrix(matrixTwo);
      System.out.println("");
      
      //create an array to hold the product
      int [][] product = new int [3][3];
      
      //Multiply the arrays
      product = MultiplyMatrix(matrixOne, matrixTwo);
      
      //read out product
      PrintMatrix(product);
   }
   //end main
   
   //Fills a matrix with random numbers
   public static void FillMatrixRandomNumbers(int [][] matrix){
   
      for (int row = 0; row < matrix.length; row++){
         for (int column = 0; column < matrix[row].length; column ++){
            matrix[row][column] = (int) (Math.random()*10);
         }
      }
   
   }
   //end FillMatrixRandomNumbers
   
   public static int[][] MultiplyMatrix (int[][] factorMatrixOne, int [][] factorMatrixTwo){
   
      int [][] product = new int [factorMatrixOne.length][factorMatrixTwo[0].length];
         
      for(int i = 0; i < factorMatrixOne.length; i ++) {
         for (int j = 0; j < factorMatrixTwo[i].length; j ++){
            for (int k = 0; k < factorMatrixOne[i].length; k ++) {
               product[i][j] += (factorMatrixOne[i][k]) * (factorMatrixTwo[k][j]);
            }
         }
      }
      return product;
   }
   //end MultiplyMatrices
   
   
   
   //Prints the contents of a matrix out to the user
   public static void PrintMatrix (int matrix [][]){
   
      for (int row = 0; row < matrix.length; row++){
         for (int column = 0; column < matrix[row].length; column ++){ 
            System.out.print(matrix[row][column] + " ");
         }
         System.out.println("");
      }
   }
   //end ReadMatrix
}
//end program
