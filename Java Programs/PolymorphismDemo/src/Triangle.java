
public class Triangle implements Planes{
    float base, height;
    Triangle(){
        base=height=0f;
    }
    Triangle(float b, float h){
        base =b;
        height = h;
    }
    
    public double area(){
        return(0.5*base*height);
    }
    
    public float circumference(){
        return(base+height);
    }
}
