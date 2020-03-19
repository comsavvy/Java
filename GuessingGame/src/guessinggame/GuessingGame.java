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
       System.out.println("HELLO, I have number between 1-20\nCan you guess my number?\nBest of luck!");
       outerLoop:
       while(true){
            byte guess=0;
            byte secretNo= (byte)(random()*20);
            byte counter= 0;            
            
            forOuter:
            for(byte i=0; i<5; ++i){
                int x=1;
                do{
                    if (x==0)System.out.println("Check-input");
                    counter = (byte) ((byte)4 - i);
                    System.out.printf("Guess: ");              
                     try{
                    guess= input.nextByte();
                     }
                    catch (Exception e){
                        System.out.println("Error! ");
                        break forOuter;
    }
                }while(x != 1);
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
            char playAgain;
            int x = 1;
           do{  
            if (x == 0 )System.out.println("Check-input!");
            System.out.println("Do you want to play again[Y/N]? ");
            //try{
                playAgain= input.next().charAt(0);
                switch (playAgain) {
                    case 'Y':
                    case 'y':
                        continue outerLoop;
                    case 'N':
                    case 'n':
                        break outerLoop;
                    default:
                        x=0;
                }
                //}
                //catch(Exception e){
                //  System.out.println("Invalid key\n");
                //}
           }while(true);
    } 
    }
    }