package demo1;

public class triangle implements shape{
     private int height;
    private int base;
   
    triangle(int h, int b){
        height= h;
        base= b;
    }
    
    public double area(){
        return (0.5 * height * base);
    }
    public double circumference(){
        return (2 * (height+base));
        
    }
}