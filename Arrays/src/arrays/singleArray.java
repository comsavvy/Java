/*
 * NAME: OGUNDEPO, Olusola Timothy
 * MATRIC NO: 18/25pj027
 * DEPARTMENT: Computer Science and Education
 */
package arrays;

public class singleArray {
// Sum
    public int Sum(int [][] x){
        int sum= 0;
        for (int row=0; row<x.length; row++){
            for (int column=0; column<x[row].length; column++){
                sum += x[row][column];
    }
    }
        return sum;
    }
// Sum of even number
public  int SumOfEven(int [][] x){
    int total= 0;
    for (int row=0; row<x.length; row++){
        for (int column= 0; column<x[row].length; column++){
            if ( x[row][column] % 2 == 0){
                total += x[row][column];
            }
        }
    }
    return total;
}
    
}
