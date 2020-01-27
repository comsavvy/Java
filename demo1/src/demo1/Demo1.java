
package demo1;

public class Demo1 {

    public static void main(String[] args) {
        
        shape tri= new triangle(12, 9);
        shape cir= new circle(12);
        
        System.out.println("The area of the Triangle is "+ tri.area());
        System.out.println("The circumference of the Triangle is "+ tri.circumference());
        
        System.out.println();
        
        System.out.println( "The area of the circle is "+ cir.area());
        System.out.println("The Circumference of the circle is "+ tri.circumference());
    }
    
}
