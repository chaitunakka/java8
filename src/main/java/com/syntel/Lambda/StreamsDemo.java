package com.syntel.Lambda;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.groupingBy;
import static java.lang.System.out;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class StreamsDemo {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("syntel", "hexaware", "cts", "tcs", "wipro");
        out.println("Streams");

        l.stream().filter(s -> s.length() > 3)
                  .map(String::toUpperCase)
                  .collect(toList())
                  .forEach(out::println);

        // Map<Integer, List<String>> m1; 
        l.stream().collect(groupingBy(String::length))
                  .forEach((k, v) -> System.out.println(k + " <-> " + v));

        Map<String, Integer> m = l.stream()
                                  .map(String::toUpperCase)
                                  .collect(toMap(s -> s, String::length));

        out.println(m);

        List<Integer> num = Arrays.asList(2, 1, 5, 4, 3);
        Collections.sort(num);
        num.stream().forEach(out::println);
        int j = num.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
        System.out.print(j + " ");

    }
}
