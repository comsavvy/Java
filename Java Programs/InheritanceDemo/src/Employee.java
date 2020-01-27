public class Employee extends Person{
  int staffNumber;
  String dept; 
  Employee(String n, String ad, String s, int ag, float w, float h, int sn, String d){
      super(n,ad,s,ag,w,h);
      staffNumber = sn;
      dept = d;
  }
  
  @Override
    public void displayDetail(){
        System.out.println("CALL TO DISPLAY WITH NO PARAMETER");
	   System.out.println("NAME: "+name);
	   System.out.println("ADDRESS: "+address);
 	   System.out.println("SEX: "+sex);
	   System.out.println("AGE: "+age);
	   System.out.println("WEIGHT: "+ weight);
           System.out.println("HEIGHT: "+ height);
           System.out.println("STAFF NUMBER: "+staffNumber);
	   System.out.println("DEPT: "+ dept);
           //super.displayDetail();
	} 
    public void displayDetail(int i){
        System.out.println("CALL TO DISPLAY WITH ONE PARAMETER");
	   System.out.println("NAME: "+name);
	   System.out.println("ADDRESS: "+address);
           System.out.println("HEIGHT: "+ height);
           System.out.println("STAFF NUMBER: "+staffNumber);
	   System.out.println("DEPT: "+ dept);
	}  
    public static void main(String[] agrs){
        Employee emp1 = new Employee("Mike", "CIS", "Male", 34, 76.0f, 6.5f, 1234, "CSC");
        Person p1= new Person();
        
        p1.displayDetail();
        
        emp1.displayDetail();
        emp1.displayDetail(0);
    }
}