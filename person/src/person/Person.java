/*
NAME: OGUNDEPO, Olusola Timothy
MATRIC: 18/25PJ027ol
DEPARTMENT: EDUCATIONAL TECHNOLOGY
PROGRAM: COMPUTER SCIENCE*/
package person;
    import java.util.Scanner;
public class Person {

public void inputs(){
    setvalues set= new setvalues();
    Scanner input= new Scanner(System.in);
    String a, b, c, d, e;
double f, g;
System.out.print("Enter you Surname: ");
a= input.nextLine();

System.out.print("Enter you Firstname: ");
b= input.nextLine();
 
System.out.print("Enter you Othername: ");
c= input.nextLine();

System.out.print("Enter you Gender: ");
d= input.nextLine();

System.out.print("Enter you Date of birth: ");
e= input.nextLine();

System.out.print("Enter you Height: ");
f= input.nextDouble();

System.out.print("Enter you Weight: ");
g= input.nextDouble();

set.setSurname(a);
set.setFirstname(b);
set.setOthername(c);
set.setGender(d);
set.setDateofBirth(e);
set.setHeight(f);
set.setWeight(g);

System.out.printf("\n\nYour Name is %s %s %s and you are a %s.\nYour date of birth is %s\nYou weigh %sKg and your are %s tall\n", set.getSurname(), set.getFirstname(), set.getOthername(), set.getGender(), set.getDateofBirth(), set.getWeight(), set.getHeight());


}
public static void main(String[] args) {
    Person personobject= new Person();
    personobject.inputs();
}
    
}
