/*
NAME: OGUNDEPO, Olusola Timothy
MATRIC: 18/25pj027
DEPARTMENT: COMPUTER SCIENCE AND EDUCATION
*/
package customerbill;

public class CustomerBill {
   
public static void main(String[] args) {
    final double programmingInJavaBook= 1550.00;
    final double labLogBook= 680.00;
    final double dictionaryTextBook= 600.30;
    final double whiteBoardMarker= 100.00;
    final double scientificCalculator= 250.00;
    int quantity[]= {3, 1, 1, 2, 2};
    
    book book= new book();
    stationary stationary= new stationary();

    //Unit Price for Book
    float java= (float) book.totalPrice(programmingInJavaBook, quantity[0]);
    float logbook= (float) book.totalPrice(labLogBook, quantity[1]);
    float dictionary= (float) book.totalPrice(dictionaryTextBook, quantity[2]);    
    double subTotalForBook= book.subTotalPrice(java, logbook, dictionary);
    
    //Unit price for Stationary
    float marker= (float) stationary.totalPrice(whiteBoardMarker, quantity[3]);
    float calculator= (float) stationary.totalPrice(scientificCalculator, quantity[4]);
    double subTotalForStat= book.subTotalPrice(marker, calculator);
    
    //Total bill
    double total= book.subTotalPrice(subTotalForBook, subTotalForStat) - book.subTotalPrice(book.discount(subTotalForBook), stationary.discount(subTotalForStat));

    //Customer's Bill
    System.out.println("Customer's Bill");
    System.out.println("Item\t\t\tQuantity\tUnit Price(#)\tTotal Price(#)");
    System.out.printf("Programming in Java\t%d\t\t%.2f\t\t%.2f\n",quantity[0], programmingInJavaBook, java);
    System.out.printf("Lab Logbook\t\t%d\t\t%.2f\t\t%.2f\n",quantity[1], labLogBook, logbook);
    System.out.printf("Dictionary\t\t%d\t\t%.2f\t\t%.2f\n",quantity[2], dictionaryTextBook, dictionary);
    System.out.printf("White Board Marker\t%d\t\t%.2f\t\t%.2f\n",quantity[3], whiteBoardMarker, marker);
    System.out.printf("Scientific Calculator\t%d\t\t%.2f\t\t%.2f\n",quantity[4], scientificCalculator, calculator);
    
    System.out.println();
    
    //Discount
    System.out.printf("Subtotal for Books:\t\t%.2f\n", subTotalForBook);
    System.out.printf("Discount:\t\t\t%.2f\n", book.discount(subTotalForBook));
    System.out.printf("Subtotal for Stationary:\t%.2f\n", subTotalForStat);
    System.out.printf("Discount:\t\t\t%.2f\n", stationary.discount(subTotalForStat)); 
    System.out.printf("Total:\t\t\t\t%.2f\n", total);
}
}