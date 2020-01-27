
public class PolymorphismDemo {
    public static void main(String[] args){
        Planes rec = new Rectangle(4.0f,6.0f);
        Planes tri = new Triangle(10.0f, 7.0f);
        
        System.out.println("The area of the rec is "+rec.area());
        System.out.println("The Circumference of the rec is "+rec.circumference());
        
        System.out.println("The area of the triangle is "+ tri.area());
        System.out.println("The Circumference of the triangle is "+ tri.circumference());   
        
    }
    
}
