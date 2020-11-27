package com.example.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person p) {
		if(age == p.age)
			return 0;
		else if(age > p.age)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

public class Compare {

	public static void main(String[] args) {
		// ArrayList<Person> al=new ArrayList<Person>();  
		// al.add(new Person("Vijay",23));  
		// al.add(new Person("Ajay",27));  
		// al.add(new Person("Jai",21));
		
		// Collections.sort(al);
		// al.forEach(System.out::println);

		Map<String, Boolean> map = new HashMap<>();
		map.computeIfAbsent("key", k -> k.length() > 1);
	}

}
