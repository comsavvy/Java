/*
NAME: OGUNDEPO, Olusola Timothy
MATRIC: 18/25PJ027
DEPARTMENT: COMPUTER SCIENCE & EDUCATION
*/ 
package direction;

public class Direction {

    static double []forward(double l[]){
        double temp;
        while(true){
        int count= 0;
        for (int i=0; i<l.length-1; i++){
            if (l[i] > l[i+1]){
                temp= l[i];
                l[i]= l[i+1];
                l[i+1]= temp;
                count= 1;
            }
        }
            if (count == 0)break;
        }
        return l;
    }
    static double [] backward(double m[]){
        double temp;
        while(true){
            int count=0;
            for (int i=0; i<m.length-1; i++){
                if(m[i]<m[i+1]){
                    temp= m[i];
                    m[i]= m[i+1];
                    m[i+1]= temp;
                    count= 1;
                }
            }
            if (count==0)break;
        }
      return m;
    }
    public static void main(String[] args) {
       double lst[]= {6.2, 4.9, 7.2, 3.8, 2.9};
       //Forward direction
       System.out.println("ForWard Direction");
       double[] num1= forward(lst);
       for(double i: num1)System.out.println(i);
       
       System.out.println();
       
       //Backward direction
       System.out.println("Reverse Direction");
       double[] num2= backward(lst);
       for(double i: num2)System.out.println(i);     
    }
}