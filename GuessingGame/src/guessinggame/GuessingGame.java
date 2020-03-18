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
        byte guess=0;
        byte secretNo= (byte)(random()*20);
        byte counter;
        System.out.println("HELLO, I have number between 1-20\nCan you guess my number?\nBest of luck!");
        for(byte i=0; i<5; ++i){
            counter = (byte) ((byte)4 - i);
            System.out.printf("Guess: ");
            guess= input.nextByte();
            if ( guess==secretNo){
                System.out.println("You Win!");
                System.out.printf("Time of Guess was %d times\n", i+1);
                break;
            }
            else if (guess > secretNo)System.out.println("Too High!");
            else if (guess < secretNo)System.out.println("Too low");
            if ( counter != 0)System.out.printf("Time-left is %d\n", counter);
        }
        if (secretNo!=guess)System.out.println("You Lose");   
    }
}