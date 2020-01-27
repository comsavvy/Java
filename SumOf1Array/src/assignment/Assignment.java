/*
 * NAME: OGUNDEPO, Olusola Timothy
 * MATRIC NO: 18/25pj027
 * DEPARTMENT: Computer Science and Education
 */
package assignment;
public class Assignment {
// Sum
    public static int assignment1(short [][] x){
        short sum= 0;
        for (short row=0; row<x.length; row++){
            for (short column=0; column<x[row].length; column++){
                sum += x[row][column];
    }
    }
        return sum;
    }
// Sum of even number
public static int assignment2(short [][] x){
    short total= 0;
    for (short row=0; row<x.length; row++){
        for (short column= 0; column<x[row].length; column++){
            if ( x[row][column] % 2 == 0){
                total += x[row][column];
            }
        }
    }
    return total;
}
    public static void main(String[] args) {
        Assignment ass= new Assignment();
        short [][] array= {{4, 2, 2, 6},
                        {3, 2, 7, 8},
                        {6, 9, 4, 2},
                        {4, 3, 2, 1},
                        {9, 8, 9, 3}};
        
        System.out.println("Total= "+ass.assignment1(array));
        System.out.println("Sum of even numbers= "+ ass.assignment2(array));
        }
    }