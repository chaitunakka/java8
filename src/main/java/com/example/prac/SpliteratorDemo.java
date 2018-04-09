package com.example.prac;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {
	public static void main(String[] args) {
		List<Integer> n = Arrays.asList(1,2,3,4,5,6);
		
		Spliterator<Integer> s1 = n.spliterator();
		
		System.out.println(s1.estimateSize());
		System.out.println(s1.getExactSizeIfKnown());
		System.out.println(s1.characteristics());
		
		Spliterator<Integer> s2 = s1.trySplit();
		s2.forEachRemaining(System.out::println);
		s1.forEachRemaining(System.out::println);
		
		int sum = n.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
