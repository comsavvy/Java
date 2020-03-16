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
