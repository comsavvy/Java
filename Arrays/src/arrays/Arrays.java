/*
 * NAME: OGUNDEPO, Olusola Timothy
 * MATRIC NO: 18/25pj027
 * DEPARTMENT: Computer Science and Education
 */
package arrays;

public class Arrays {

    public static void main(String[] args) {
        singleArray single= new singleArray();
        doubleArrays two= new doubleArrays();
        
        int [][] array= {{4, 2, 2, 6},
                        {3, 2, 7, 8},
                        {6, 9, 4, 2},
                        {4, 3, 2, 1},
                        {9, 8, 9, 3}};
        
        int [][]array2= {{5, 2, 3, 2},
                        {3, 2, 9, 7},
                        {6, 2, 9, 3},
                        {8, 3, 2, 1},
                        {3, 2, 9, 3}};

        
System.out.println("The Sum of Array is "+single.Sum(array));
System.out.println("The sum of the Even number of the Array is "+single.SumOfEven(array));

//Display the Sum of the Arrays to the screen
System.out.println("\n\tThe sum of the arrays\t");        
two.addition(array, array2);
for (int row=0; row<array.length; row++){
    for (int column=0; column<array[row].length; column++){
        System.out.printf("%d\t",two.sum[row][column]);
        }
    System.out.println();
        }        
        
//Display the product of the Arrays to the screen
System.out.println("\n\tThe product of the arrays\t");        
two.multiplication(array, array2);        
for (int row=0; row<array.length; row++){
    for (int column=0; column<array[row].length; column++){
        System.out.printf("%d\t",two.product[row][column]);
            }
    System.out.println();
        }   
    }
}
