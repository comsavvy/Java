package customerbill;
/**
 *
 * @author SHOLAY
 */
public class stationary {
   
   final double totalPrice(double price, int qty){
        return price*qty;
    }
    final double discount(double price){
       return price * (3.0/100);
    }   
}
