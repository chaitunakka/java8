package com.example.prac;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverage {
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		int sum = Arrays.stream(array).sum();
		System.out.println(sum);
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(array).average();
		System.out.println(avg.getAsDouble());
	}

}
