
package assignment2;
public class Assignment2 {
   private int [][]sum={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   private int [][]product={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   
// Sum of Array 
    public void addition(int [][]x, int [][]y){
        for(int row= 0; row<x.length; row++){
        for (int column=0; column<y[row].length; column++){
            sum[row][column]= x[row][column]+ y[row][column];            
            }
        }
    }
// Product of the Arrays
    public void multiplication(int [][]x, int [][]y){
        for(int row= 0; row<x.length; row++){
        for (int column=0; column<y[row].length; column++){
            product[row][column]= x[row][column] * y[row][column];            
            }
        }
    }
    
    public static void main(String[] args) {
        int [][] array= {{4, 2, 2, 6},
                        {3, 2, 7, 8},
                        {6, 9, 4, 2},
                        {4, 3, 2, 1},
                        {9, 8, 9, 3}};
        
        int [][]array2= {{5, 2, 3, 2},
                        {3, 2, 9, 7},
                        {6, 2, 9, 3},
                        {8, 3, 2, 1},
                        {1, 2, 9, 2}};
        
        short [][]array3= {{5, 2, 3, 2},
                        {3, 2, 9, 7},
                        {6, 2, 9, 3},
                        {8, 3, 2, 1},
                        {1, 2, 9, 2}};
        
        Assignment2 ass= new Assignment2();
                
        //Display the Sum of the Arrays to the screen
        System.out.println("\tThe sum of the arrays\t");        
            ass.addition(array, array2);
        
        for (int row=0; row<array.length; row++){
            for (int column=0; column<array[row].length; column++){
            System.out.printf("%d\t",ass.sum[row][column]);
        }
            System.out.println();
        }
    //Display the product of the Arrays to the screen
        System.out.println("\n\tThe product of the arrays\t");        
        ass.multiplication(array, array2);
        
        for (int row=0; row<array.length; row++){
            for (int column=0; column<array[row].length; column++){
            System.out.printf("%d\t",ass.product[row][column]);
        }
            System.out.println();
        }
    }
}