/*
 * NAME: OGUNDEPO, Olusola Timothy
 * MATRIC NO: 18/25pj027
 * DEPARTMENT: Computer Science and Education
 */
package arrays;

public class doubleArrays{
    
   public int [][]sum={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   public int [][]product={{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},{0, 0, 0, 0},{0, 0, 0, 0}};
   
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
}
