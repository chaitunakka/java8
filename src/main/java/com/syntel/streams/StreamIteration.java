package com.syntel.streams;

import static java.lang.System.out;

import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class StreamIteration{
	public static void main(String[] args) {
		Stream.iterate(1, n -> n+1).limit(20).forEach(out::println);
		Stream.generate(UUID::randomUUID).skip(10).limit(10).forEach(out::println);

		IntStream.iterate(1, n -> n+1).limit(20).forEach(out::println);
		IntStream.range(1, 11).forEach(out::println);
		IntStream.rangeClosed(1, 10).forEach(out::println);
		// IntStream.range(1, 11).forEach(n -> System.out.println(UUID.randomUUID()));
		
	}
}