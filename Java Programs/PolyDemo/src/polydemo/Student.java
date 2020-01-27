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
public class Student extends Person{
    String matric_no;
    Student(){
        super();
        matric_no = new String();
    }
    
    Student(String n, int i, String m){
        super(n,i);
        matric_no = m;
    }
    
    public void display(){
        System.out.println("Inside class Student");
        System.out.println("Name is "+ name);
        System.out.println("ID is "+ ID);
        System.out.println("Matric Numb is "+ matric_no);
        
    }
    
}
