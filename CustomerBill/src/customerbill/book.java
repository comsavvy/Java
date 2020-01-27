package customerbill;
/**
 *
 * @author SHOLAY
 */
 class book {
   final double totalPrice(double price, int qty){
        return price*qty;
    }
   final double discount(double price){
       return price * (6.25/100);
    }
    double subTotalPrice(double ...p){
        double result= 0;
        for (double i : p)result += i;
        return result;
    }
}
