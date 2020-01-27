/*
NAME: OGUNDEPO, Olusola Timothy
MATRIC: 18/25PJ027
DEPARTMENT: EDUCATIONAL TECHNOLOGY
PROGRAM: COMPUTER & EDUCATION
*/
package purse;

public class Purse {
    private int initialMoney;
    
    Purse(int i){
        initialMoney= i;
    }
    
    void addMoney(int a){
        initialMoney += a;
    }
    
    void debit(int b){
        initialMoney -= b;
    }
    
   public String toString(){
        return String.format("Your Balance is %s", initialMoney);
    }
   
    public static void main(String[] args) {
    Purse p = new Purse(9000);
    p.debit(4000);
        System.out.printf("%s \n", p);
        
    p.debit(2000);
        System.out.printf("%s \n", p);
    p.addMoney(6000);
        System.out.printf("%s \n", p);
    }    
}
