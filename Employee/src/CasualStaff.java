/*
NAME: OGUNDEPO, Olusola Timothy
DEPARTMENT: COMPUTER SCIENCE AND EDUCATION
MATRIC: 18/25PJ027
*/
public class CasualStaff {
    private String role;
    private char role1;
    private String status;
    private String name;
    private int wagePerHour;
    private int wage;
    private int hoursWork;
CasualStaff(String nm, String st, char r, int hour){
    name= nm;
    status= st;
    role1= r;
    hoursWork= hour;  
}
String name(){
    return name;
}
String role(){
 if (role1== 'c'){
     role="Cleaner";
     wagePerHour=150;
    wage = hoursWork * wagePerHour;
 }
 else if (role1== 'd'){
     role="Driver";
     wagePerHour= 200;
    wage=  hoursWork * wagePerHour;
 }
 else if (role1== 'p'){
     role="Packer";
    wagePerHour= 180;
    wage=  hoursWork * wagePerHour;
 }
 return role;
}
String status(){
    return status;
}
int hoursWork(){
    return hoursWork;
}
int earnings(){
  return wage;
}
}
