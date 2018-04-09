package com.example.prac;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamError {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,0,4,5);
		
		list.forEach(check(i -> System.out.println(50/i)));
	}
	
	static Consumer<Integer> check(Consumer<Integer> divPrint) {
		return i -> {
			try {
				divPrint.accept(i);
			} catch (ArithmeticException ae) {
				System.out.println("Division by zero is not allowed");
			}
		};
	}

}
