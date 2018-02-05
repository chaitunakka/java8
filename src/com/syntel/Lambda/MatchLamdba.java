package com.syntel.Lambda;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.syntel.Lambda.model.Employee;

class MatchLambda{
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(
                new Employee(1, "jon", 1000),
                new Employee(1, "jon", 2000),
                new Employee(2, "jon", 3000),
                new Employee(3, "jon", 4000)
        );

        Spliterator<Employee> s = emp.spliterator();
        Spliterator<Employee> s1 = s.trySplit();

        out.println("Split org");
        s.forEachRemaining(out::println);
        out.println("Split 1");
        s1.forEachRemaining(out::println);

        Predicate<Employee> sal = e -> e.getSalary() > 3000;
        out.println(emp.stream().anyMatch(sal));
        Optional<Employee> e= emp.stream().findAny();
        out.println(e.get());

        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }

        Stream.iterate(1, n -> n+1).limit(items.size()).forEach(out::println);
    }
}