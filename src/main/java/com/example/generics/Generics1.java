package com.example.generics;

import java.util.Arrays;

class List<V extends Number & Comparable<V>> {
	public Integer print(V i) {
		return (Integer) i;
	}
	
	public boolean compare(V n1, V n2) {
		return n1.compareTo(n2) == 0;
	}
	
	public void printList(java.util.List<? extends V> l) {
		l.forEach(System.out::println);
	}
}

public class Generics1 {

	public static void main(String[] args) {
		List<Integer> l = new List<>();
		System.out.println(l.print(1));
		System.out.println(l.compare(1,2));
		l.printList(Arrays.asList(1,2,3,4,5));
	}

}
