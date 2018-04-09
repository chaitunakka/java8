package com.syntel.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Object>{
	private int roll;
	private String name;

	Student(int roll, String name){
		this.roll = roll;
		this.name = name;
	}
	public int getRoll(){
		return roll;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		return "Roll : "+roll+" Name : "+name;
	}
	@Override
	public boolean equals(Object o){
		if(null != o && o instanceof Student){
			if(this.roll == ((Student)o).getRoll()){
				return true;
			}
		}
		return false;
	}
	@Override
	public int compareTo(Object o) {
		if(null != o && o instanceof Student){
			if(this.roll > ((Student)o).getRoll()) return 1;
			else if(this.roll == ((Student)o).getRoll()) return 0;
			else return -1;
		}
		return 0;
	}
}

class ComparableDemo{
	public static void main(String[] args) {
		Student s2 = new Student(2, "Abc");
		Student s1 = new Student(2, "Ab");
		System.out.println(s1.equals(s2));
		List<Student> slist = Arrays.asList(s2, s1);
		Collections.sort(slist);
		slist.forEach(System.out::println);
		Collections.sort(slist, (Student s11, Student s21) -> s11.getName().compareTo(s21.getName()));
		slist.forEach(System.out::println);
	}
}