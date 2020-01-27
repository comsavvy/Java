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
public class Employee extends Person {
    String dept;
    Employee(){
        super();
        dept = new String();
    }
    Employee(String n, int i, String d){
        super(n,i);
        dept = d;
    }
    public void display(){
        System.out.println("Inside class Employee");
        System.out.println("Name is "+ name);
        System.out.println("ID is "+ ID);
        System.out.println("Department is "+ dept);
    }
    
}
