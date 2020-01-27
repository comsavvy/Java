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
public class Person {
    String name;
    int ID;
    Person(){
        name=new String();
        ID = 0;
    }
    Person(String n, int i){
        name =n;
        ID=i;
    }
    public void display(){
        System.out.println("Inside class Person");
        System.out.println("Name is "+ name);
        System.out.println("ID is "+ ID);
    }
    
}
