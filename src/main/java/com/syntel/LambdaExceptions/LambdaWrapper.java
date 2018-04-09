package com.syntel.LambdaExceptions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class LambdaWrapper {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,6,7,0);
		list.forEach(lambdaWrapper(i -> System.out.println(50/i)));
	}

	static Consumer<Integer> lambdaWrapper(Consumer<Integer> c) {
		return i -> {
			try {
				System.out.println("-=-=-=-=-=-=-=-=-=-=-="+i);
				c.accept(i);
			} catch(ArithmeticException ae) {
				System.out.println("Division by zero not allowed");
			}
		};
	}
}
