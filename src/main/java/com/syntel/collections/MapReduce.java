package com.syntel.collections;

import java.util.Arrays;
import java.util.List;

/**
 * MapReduce
 */
public class MapReduce {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream().anyMatch(i -> (i%2 == 0)));

    }
}