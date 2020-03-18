/*
NAME: OGUNDEPO OLUSOLA TIMOTHY
MATRIC NO: 18/25PJ027
SCHOOL: UNILORIN
*/
package guessinggame;

import static java.lang.Math.random;
import java.util.Scanner;
public class GuessingGame {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
       int y= 2;
       while(y>0){
        byte guess=0;
        byte secretNo= (byte)(random()*20);
        byte counter= 0;
        System.out.println("HELLO, I have number between 1-20\nCan you guess my number?\nBest of luck!");
        try{
        for(byte i=0; i<5; ++i){
            int x=1;
                counter = (byte) ((byte)4 - i);
                System.out.printf("Guess: ");              
                guess= input.nextByte();
            if (guess==secretNo){
                System.out.println("You Win!");
                System.out.printf("Time of Guess was %d times\n", i+1);
                break;
            }
            else if (guess > secretNo)System.out.println("Too High!");
            else if (guess < secretNo)System.out.println("Too low");
            if ( counter != 0)System.out.printf("Time-left is %d\n", counter); 
        }
        if (secretNo!=guess)System.out.println("You Lose");  
    }    catch (Exception e){
            System.out.print("Error!\n");
}
            char playAgain;
            --y;
            if (y != 0){
           System.out.println("Do you want to play again[Y/N]? ");
           playAgain= input.next().charAt(0);
           if (playAgain=='Y' || playAgain== 'y'){
               continue;
           }else if (playAgain=='N' || playAgain=='n') break;
           else System.out.println("Invalid key\n");
            }
 }
    }
}