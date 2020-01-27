
public class Person {
    String name, address, sex;
    int age; 
    float weight, height;
Person(){
        age=0;
        weight=0.0f;
        height=0.0f;
}
Person(String n, String a, String s, int ag,float w, float h){
	  name=n; address=a; sex=s; 
	 age=ag;weight=w;height=h;
}

public void displayDetail(){
   System.out.println("CALL TO DISPLAY IN CLASS PERSON");
   System.out.println("NAME: "+name);
   System.out.println("ADDRESS: "+address);
   System.out.println("SEX: "+sex);
   System.out.println("AGE: "+age);
   System.out.println("WEIGHT: "+ weight);
   System.out.println("HEIGHT: "+ height);
}
}
