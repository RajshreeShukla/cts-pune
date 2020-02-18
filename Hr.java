package cognizant.com;
class Employeee {
void fix() {
	System.out.println("i am an employee");
}}
class Person extends Employeee {
void display() {
System.out.println("i am person");
}
}

public class Hr extends Person {
void odd() {
	System.out.println("....");
}
public static void main(String[]args) {
	Employeee emp=new Employeee();
	emp.fix();
	Person pr=new Person();
	pr.display();
Test tst=new Test();
tst.t_call();
}}
class Test{
	void t_call() {
		System.out.println("test here");
	}

}
