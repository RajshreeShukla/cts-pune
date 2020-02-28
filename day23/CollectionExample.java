package com.cts.training.collection;
import java.util.*;

public class CollectionExample implements Comparable<CollectionExample> {
	int id;
	String name;
	String city;
	String desig;
	int age;
	double salary;
	long phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "CollectionExample [id=" + id + ", name=" + name + ", city=" + city + ", desig=" + desig + ", age=" + age
				+ ", salary=" + salary + ", phone=" + phone + "]";
	}

	public CollectionExample(int id, String name, String city, String desig, int age, double salary, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.desig = desig;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

@Override
public int compareTo(CollectionExample o) {
if(this.id>o.id){	
	return 1;
	}
else if(this.id == o.id) {
	return 0;
}
else {
	return -1;
}
}

}
