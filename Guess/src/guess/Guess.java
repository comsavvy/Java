package guess;
import java.util.Random;
import javax.swing.JOptionPane;

public class Guess {
    static Random random= new Random();
    
    public static void main(String[] args) {
        int secretNo= random.nextInt(21);
        boolean isWin= false;
        int timeOfGuess;
        JOptionPane.showMessageDialog(null, "Hello!\nI have a secret number between 1-20\ncan you Guess my number?");
        for (int count=1; count<=5; count++){        
            timeOfGuess= 5-count;
            String guess= JOptionPane.showInputDialog("Guess" );
            int guessingNo= Integer.parseInt(guess);
            if(guessingNo>secretNo){
                JOptionPane.showMessageDialog(null,"Too High", "Timeleft is "+timeOfGuess, JOptionPane.PLAIN_MESSAGE);
            }
            else if(guessingNo<secretNo){
                JOptionPane.showMessageDialog(null, "Too low","Timeleft is "+timeOfGuess, JOptionPane.PLAIN_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "You win!", "Winner", JOptionPane.PLAIN_MESSAGE);
                isWin= true;
                break;
            }  
    }
        if (!isWin){
            JOptionPane.showMessageDialog(null, "You lose!", "Bloody Loser", JOptionPane.PLAIN_MESSAGE);
    }}}