/*
NAME: OGUNDEPO, Olusola Timothy
MATRIC: 18/25PJ027
DEPARTMENT: EDUCATIONAL TECHNOLOGY
PROGRAM: COMPUTER SCIENCE*/
package person;

public class setvalues {
private String surname;
private String firstname;
private String othername;
private String gender;
private String dateofbirth;
private double height, weight;

public void setSurname(String s){
    surname= s;
}
public void setFirstname(String f){
    firstname= f;
}
public void setOthername(String o){
    othername= o;
}
public void setGender(String g){
    gender= g;
}       
public void setDateofBirth(String d){
    dateofbirth= d;
}
public void setHeight(double h){
    height= h;
}
public void setWeight(double w){
    weight= w;
}
public String getSurname(){
    return surname;
}
public String getFirstname(){
    return firstname;
}
public String getOthername(){
    return othername;
}
public String getGender(){
    return gender;
}
public String getDateofBirth(){
    return dateofbirth;
}
public double getHeight(){
    return height;
}
public double getWeight(){
    return weight;
}

}
