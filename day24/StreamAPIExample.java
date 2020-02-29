package com.cts.training.stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIExample {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		addNames(names);
		
		
		// print names with length more than 6
		
		List<String> namesList = names.stream().filter(sup -> sup.length() > 6).collect(Collectors.toList());
		System.out.println("List is : " + namesList);
		
		
		// nmaes in uppercase
		
		List<String> namesInUp = names.stream().map(sup -> sup.toUpperCase()).collect(Collectors.toList());
		
		
		// System.out.println("upper case results : " + namesInUp);
		
		namesInUp.forEach(System.out::println);
		long count = names.stream().count();
		System.out.println(count);
		Stream<Integer> str = Stream.of(1, 11, 111, 1111, 11111);
		System.out.println("Data Count : " + str.count());
		Stream<String> name = Stream.of("C", "C++", "Java", "Angular");
		
		
		// List<String> names4 = name.filter(sup -> sup.length() <
		
		
		
		// 4).collect(Collectors.toList());
		
		List<String> name5 = name.map(sup -> sup.concat(" programming")).collect(Collectors.toList());
		
		
		// System.out.println(names4);
		
		System.out.println("\n" + name5);
		
		
		
		//sorting
		
		List<String> defaultSorted =names.stream().sorted().collect(Collectors.toList());
		defaultSorted.forEach(System.out::println);
	
	   //custom sorting
		
		
		List<String> customSorted =names.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("descending sorting");
		customSorted.forEach(System.out::println);
		
		
	}

	private static void addNames(ArrayList<String> names) {
		names.add("Harshita");
		names.add("Rajshree");
		names.add("Pulkit");
		names.add("Anubhuti");
		names.add("Ajay");
		names.add("Roohi");

	}
}
