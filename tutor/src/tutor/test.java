package tutor;

public class test {
    private float base, height, r;
    private final float PI= 3.142F; 
    
    test(){
        base=0;
        height=0;
        r=0;
    }
    
    test (float x, float y){
        base= x;
        height=y;
    }
    
    
    test(int radius){
        r= radius;
    }
    
    public void addition(){
        float sum= base+height;
        System.out.println("Sum: "+sum);
    }
    
    public void subtraction(){
        float subtract= base - height;
        System.out.println("Difference: "+subtract);
    }
    
    public void Area(){
        double area= ((double)1 / 2) * base * height;
        System.out.println("Area of Triangle: "+area);
    }
    
   public void AreaOfCircle(){
       float area= PI * r * r;
        System.out.println("Area of Circle: "+area);
   }
   
   public void Circumference(){
       float circumference= PI * 2 * r;
        System.out.println("Circumference: "+circumference);
   }
}
