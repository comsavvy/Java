package introtoguii;
import javax.swing.JOptionPane;

public class IntroToGUIi {


    public static void main(String[] args) {
     String fn= JOptionPane.showInputDialog("Enter first number: ");
     String sn= JOptionPane.showInputDialog("Enter second number: ");
     
     float first= Float.parseFloat(fn);
     float second= Float.parseFloat(sn);
     
     float sum= first + second;
     
     JOptionPane.showMessageDialog(null, sum , "Sum", JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
