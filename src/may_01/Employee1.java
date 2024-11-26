package may_01;

class Employee{
private String empName;
private int empid;
private String empAdress;
private double salary;

public Employee(){
super();
}
public Employee(String empName,int empid,String empAdress,double salary)
{
super();
this.empName=empName;
this.empid=empid;
this.empAdress=empAdress;
this.salary=salary;
}
public void setempName(String empName){
this.empName=empName;
}
public void setempid(int empid){
this.empid=empid;
}
public void setempAdress(String empAdress){
this.empAdress=empAdress;
}
public void setsalary(double salary){
this.salary=salary;
}
public String getName(){
return this.empName;
}
public int getempid(){
return this.empid;
}
public String getempAdress(){
return empAdress;
}
public double getsalary(){
return salary;
}
public double calculatetax()
{
if(salary>30000){
salary=salary%30;
return salary;
}
else {
salary=salary%10;
return salary;
}
}

public String setdata() {
	return empName+empid+empAdress+salary;
	
	
}

}
public class Employee1{
public static void main(String[] args){
Employee e1=new Employee("raju",13,"hyd",50000);
System.out.println(e1.setdata());
System.out.println(e1.calculatetax());
Employee e2=new Employee("rahman",14,"hyd",40000);
System.out.println(e2.setdata());
Employee e3=new Employee("rahul",15,"hyd",20000);
System.out.println(e3.setdata());
}
}





