package com.example.prac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.System.out;

class Emp {
	private String name;
	private int age;

	public Emp(String name, int age) {
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
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}

class EmpAgeComparator implements java.util.Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getAge() == o2.getAge())
			return 0;
		else if(o1.getAge() > o2.getAge())
			return 1;
		else
			return -1;
	}
	
}

class EmpNameComparator implements java.util.Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

public class Comparator {

	public static void main(String[] args) {
		List<Emp> elist = Arrays.asList(new Emp("A",1),new Emp("A",2),new Emp("B",6),new Emp("C",3),new Emp("D",3),new Emp("D",1));
		Collections.sort(elist, new EmpAgeComparator());
		elist.forEach(out::println);
		System.out.println("-----------------");
		Collections.sort(elist, new EmpNameComparator());
		elist.forEach(out::println);
		System.out.println("-----------------");
		Predicate<Emp> ageLessThanThree = e -> e.getAge() <= 3 ;
		List<Emp> empFilter = elist.stream()
									.filter(ageLessThanThree)
									.collect(Collectors.toList());
		empFilter.forEach(out::println);
		System.out.println("-----------------");
		elist.sort(java.util.Comparator.comparingInt(Emp::getAge));
		elist.forEach(out::println);
	}

}
