package cognizant.com;
import java.util.Scanner;

public class Employee {
	String name;
	int salary;
	int id;
	String desi;
    
   
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesi() {
		return desi;
	}
	public void setDesi(String desi) {
		this.desi = desi;
	}
	
public static void main(String[]args) {
	Employee emp=new Employee();
	emp.setName("raj");
	emp.setSalary(800000);
emp.setId(78);
emp.setDesi("developer");
System.out.println("id = "+emp.id);
System.out.println("name = "+emp.name);
System.out.println("designation = "+emp.desi);
System.out.println("salary = "+emp.salary);

	Salary sal=new Salary();
	sal.Calculate();
	sal.Display();
	System.out.print("sal.Calculate()");
	System.out.println("sal.Display()");
	

}
}
	

