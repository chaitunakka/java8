package com.prac;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Vowels {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string");
		String string = scanner.next();
		scanner.close();
		
		char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
		
		Map<String, Integer> subStrings = new HashMap<>();
		
		for (int i = 0; i < string.length(); i++) {
			for (int j = 1; j <= string.length()-i; j++) {
				subStrings.put(string.substring(i, j+i), 0);
			}
		}
		
		BiConsumer<String, Integer> checkVowels = (key,value) -> {
			for (int i = 0; i < vowels.length; i++) {
				if (key.indexOf(vowels[i]) >= 0) {
					subStrings.put(key, value+1);
				}
			}
		};
		
		subStrings.forEach(checkVowels);
		subStrings.forEach((k, v) -> System.out.println(k + "-" + v));
	}
}
