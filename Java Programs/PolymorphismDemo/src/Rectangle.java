
public class Rectangle implements Planes{
    float lent, bret;
    Rectangle(){
        lent=0;
        bret =0;
    }
    Rectangle(float a, float b){
        lent = a;
        bret = b;
    }
    public double area(){
        return (lent*bret);
    }
    public float circumference(){
        return(2*(lent+bret));
    }
}
