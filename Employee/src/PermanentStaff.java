/*
NAME: OGUNDEPO, Olusola Timothy
DEPARTMENT: COMPUTER SCIENCE AND EDUCATION
MATRIC: 18/25PJ027
*/
public class PermanentStaff {
private String name;
private int salary;
private String level;
private String address;
private String gender;
private String nextOfKin;
private String status;
public PermanentStaff(String n, String st, String l, int s){
name= n;
status= st;
level= l;
salary= s;
}
 
int earnings(){
    return salary;
}
String name(){
    return name;
}
String status(){
    return status;
}
void setNextOfKin(String snt){
    nextOfKin= snt;
}
void setAddress(String adr){
    address= adr;
}
String level(){
    return level;
}
}
