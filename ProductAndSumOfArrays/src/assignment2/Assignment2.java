package assignment2;
public class Assignment2 {
   private static int [][]sum = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   private static int [][]product = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   
// Sum of Array 
    public void addition(int [][]x, int [][]y){
        for(int row=0; row<x.length; row++){
            for (int column=0; column<y[row].length; column++){
                sum[row][column] = x[row][column]+ y[row][column];            
}}}
// Product of the Arrays
    public void multiplication(int [][]x, int [][]y){
        for(int row=0; row<x.length; row++){
            for (int column=0; column<y[row].length; column++){
                product[row][column] = x[row][column] * y[row][column];            
}}}
    // Displaying the content of the array
    public void display(int [][] array){        
        for (int rows=0; rows < array.length; rows++){
            for (int columns=0; columns < array[rows].length; columns++){
                System.out.printf("%d\t", array[rows][columns]);
            }
            System.out.println();
}
        System.out.println();
}
    /* The main execution of the program */
    public static void main(String[] args) {
        int [][] array = {{4, 2, 2, 6},
                        {3, 2, 7, 8},
                        {6, 9, 4, 2},
                        {4, 3, 2, 1},
                        {9, 8, 9, 3}};
        
        int [][]array2 = {{5, 2, 3, 2},
                        {3, 2, 9, 7},
                        {6, 2, 9, 3},
                        {8, 3, 2, 1},
                        {1, 2, 9, 2}};
        
        int [][]array3 = {{5, 2, 3, 2},
                        {3, 2, 9, 7},
                        {6, 2, 9, 3},
                        {8, 3, 2, 1},
                        {1, 2, 9, 2}};
        
        Assignment2 operation = new Assignment2();
    
    // Displaying the three array here
        System.out.println("\t Array 1");
        operation.display(array);        
        System.out.println("\t Array 2");
        operation.display(array2);
        System.out.println("\t Array 3");
        operation.display(array3);
    
    //Display the Sum of the Arrays to the screen
        System.out.println("\tThe sum of the array 1 & 2\t");        
        operation.addition(array, array2);
        operation.display(sum);
        
    //Display the product of the Arrays to the screen
        System.out.println("\n\tThe product of the array 1 & 2\t");        
        operation.multiplication(array, array2);
        operation.display(product);
}}
