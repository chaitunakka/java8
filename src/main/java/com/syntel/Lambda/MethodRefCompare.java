package com.syntel.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

class Employee {
	private String name;
	private int age;
	
	public Employee() {
		super();
	}
	public Employee(String name, int age) {
		super();
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
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	/**
	 * Static method reference - compare by Age
	 * @param e1
	 * @param e2
	 * @return
	 */
	static int compareByAge(Employee e1, Employee e2) {
		return e1.getAge()<e2.getAge() ? -1 : e1.getAge()>e2.getAge() ? 1 : 0;
	}
	
	/**
	 * Static method reference - compare by Name
	 * @param e1
	 * @param e2
	 * @return
	 */
	static int compareByName(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
	/**
	 * Reference to an instance method of a particular object - compare by Age
	 * @param e1
	 * @param e2
	 * @return
	 */
	int compareObjectByAge(Employee e1, Employee e2) {
		return e1.getAge()<e2.getAge() ? -1 : e1.getAge()>e2.getAge() ? 1 : 0;
	}
	
	/**
	 * Reference to an instance method of a particular object - compare by Name
	 * @param e1
	 * @param e2
	 * @return
	 */
	int compareObjectByName(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
}

public class MethodRefCompare {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee("emp1", 20), new Employee("emp4", 15), new Employee("emp3", 30));
		List<String> strList = Arrays.asList("Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda");
		
		//Static method reference
		Collections.sort(empList, Employee::compareByAge);
		empList.forEach(out::println);
		empList.sort(Employee::compareByName);
		empList.forEach(out::println);
		
		//Reference to an instance method of a particular object
		Employee emp = new Employee();
		Collections.sort(empList, emp::compareObjectByAge);
		empList.forEach(out::println);
		empList.sort(emp::compareObjectByName);
		empList.forEach(out::println);
		
		//Reference to an Instance Method of an Arbitrary Object of a Particular Type
		strList.sort(String::compareTo);
		strList.forEach(out::println);
		empList.forEach(Employee::toString);
	}

}
