/*
NAME: OGUNDEPO, Olusola Timothy
DEPARTMENT: COMPUTER SCIENCE AND EDUCATION
MATRIC: 18/25PJ027
*/
public class Employee {
final static int level1[]= {85000, 100000, 150000, 250000};        
final static int level2[]= {222150, 237150, 287150, 350150};        
final static int level3[]= {365200, 380200, 430200, 500200};

public static void main(String[] args) {
String name1, name2, address, dateOfBirth, nextOfKin, dept, gender;

//Permanent Staff
name1="Adeleke John";
PermanentStaff permanent= new PermanentStaff(name1, "Permanent", "Level 2 Step 3", level2[2]);
System.out.println("NAME: "+permanent.name());
System.out.println("STATUS: "+permanent.status());
System.out.println("LEVEL: "+permanent.level());
System.out.println("SALARY: #"+permanent.earnings());
        
System.out.println();

//Casual Staff
name2= "Paul Ajayi";
CasualStaff casual= new CasualStaff(name2, "Casual", 'c', 10); //c -> cleaner
System.out.println("NAME: "+casual.name());
System.out.println("STATUS: "+casual.status());
System.out.println("ROLE: "+casual.role());
System.out.printf("HOURS WORKED: %dhrs\n",casual.hoursWork());
System.out.println("WAGES: #"+casual.earnings());
    }  
}
