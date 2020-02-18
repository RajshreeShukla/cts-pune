package cognizant.com;

public class SetGet {

	private int age=56;
	private double salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

public static void main(String[]args) {
	SetGet sg=new SetGet();
	sg.setAge(56);
	sg.setSalary(698446445);
	System.out.println(sg.age);
}

}