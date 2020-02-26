package com.ctstraining.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class SerializationDemo {

	public static void serialize(Employee employee, String path) throws FileNotFoundException {

		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oos = new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Object deserialize(String filepath) throws FileNotFoundException{
		try {
			FileInputStream fin = new FileInputStream(filepath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(bin);
			Object obj = oin.readObject();
			oin.close();
			return obj;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws FileNotFoundException {
	//Employee employee = new Employee(101, "navratan", "c36streeet", "developer", 45, 3400, 4567893);
	//serialize(employee, "C:\\Users\\admin\\Desktop\\github\\cts-pune\\day21\\emp6.txt");
	//System.out.println("Object added successfully");
Employee employee=(Employee)deserialize("C:\\Users\\admin\\Desktop\\github\\cts-pune\\day21\\emp6.txt");
System.out.println(employee);
	}
}

