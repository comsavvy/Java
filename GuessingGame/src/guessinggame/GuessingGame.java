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
       byte secretNo;
       boolean confirm= true;       
       boolean toRedo= true;
       System.out.println("HELLO, I have number between 1-20\nCan you guess my number?\nBest of luck!");
       whileOuter:
       while(true){
            int guess=0;
            secretNo= (byte)((1+random())*10);
            int counter= 0;            
            
            forOuter:
            for(byte i=0; i<5; ++i){
                int x=1;
                do{
                    if(confirm){
                    counter = 4 - i;
                    System.out.printf("Guess: ");              
                     try{
                    guess= input.nextInt();
            }
                    catch (Exception e){
                        confirm= false;   
                        toRedo= false;
                        continue whileOuter;                        
    }
            }
                }while(x != 1);
                
                if(confirm){
                    //Winning Point
                if (guess==secretNo){
                    System.out.println("You Win!");
                    System.out.printf("Time of Guess was %d times\n", i+1);
                    break;
            }
                else if (guess > secretNo)System.out.println("Too High!");
                else if (guess < secretNo)System.out.println("Too low");
                if ( counter != 0)System.out.printf("Time-left is %d\n", counter); 
            }
            }
            //Losing Point
        if (secretNo!=guess)System.out.println("You Lose!");     
            char playAgain;
            boolean x = true;
           do{ 
               String garbageError;
               if (toRedo==false){
                   garbageError= input.next();
                   toRedo= true;
                   System.out.printf("Because you Enter /'%s'/\n", garbageError);
            }
               else if(toRedo){
                    if (!x){
                        x= true;
                        System.out.println("Check-input!");
                        continue;
            }
                    else if(x){                                   
                    System.out.println("Do you want to play again[Y/N]? ");            
                        confirm= true;                
                        playAgain= input.next().charAt(0);
                        switch (playAgain) {
                            case 'Y':
                            case 'y':
                                continue whileOuter;
                            case 'N':
                            case 'n':
                                break whileOuter;
                            default:
                                x= false;
            }
            }
            }
            }while(true);
    }
    }
    }