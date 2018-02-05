package com.syntel.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import static java.lang.System.out;

class StreamsDemo2{
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

		nums.stream()
			.map(StreamsDemo2::countFactors)
			.forEach(out::println);
	}

	static long countFactors(int n){
		IntPredicate isDivisible = i -> n % i == 0;
		return IntStream.rangeClosed(1, n)
						.filter(isDivisible)
						.count();
	}
}
