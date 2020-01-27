package demo1;

public class circle implements shape{
    
    private int radius;
    circle(int r){
        radius= r;
    }
    
    public double area(){
        return ( 3.142 * radius * radius );
    }
    public double circumference(){
        return (2 * 3.142 * radius);
    }
}
