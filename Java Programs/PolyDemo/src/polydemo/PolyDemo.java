/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polydemo;

/**
 *
 * @author DR
 */
public class PolyDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p = new Person("Peter",1234);
        Person  e = new Employee("Adams", 3456,"Works");
        Person s = new Student("Danjuma", 9876,"12/55EC111");
        
        p.display();
        e.display();
        s.display();
        
    }
    
}
