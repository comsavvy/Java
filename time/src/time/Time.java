/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author user
 */
public class Time {

public static void main(String[] args) {
mil_reg obj= new mil_reg();
System.out.println(obj.toMilitary());
System.out.println(obj.toString());
obj.setTime(6, 27, 6);
System.out.println(obj.toMilitary());
System.out.println(obj.toString());

}
    
}
