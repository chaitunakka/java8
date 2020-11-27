package com.example.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Compare
 */
public class Compare {

    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "value1");
        map1.put("key2", "value2");

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "value1");
        map2.put("key2", "value2");

        System.out.println(map1.equals(map2));
        System.out.println(streamCompare(map1, map2));

        Map<String, String[]> map3 = new HashMap<>();
        map3.put("1", new String[]{"val1", "val2"});
        map3.put("2", new String[]{"val3", "val4"});

        Map<String, String[]> map4 = new HashMap<>();
        map4.put("1", new String[]{"val1", "val2"});
        map4.put("2", new String[]{"val3", "val4"});

        System.out.println(map3.equals(map4));
        System.out.println(arraysCompare(map3, map4));
    }

    private static boolean streamCompare(Map<String, String> map1, Map<String, String> map2) {
        return map1.entrySet().stream()
                    .allMatch(e -> e.getValue().equals(map2.get(e.getKey())));
    }

    private static boolean arraysCompare(Map<String, String[]> map1, Map<String, String[]> map2) {
        return map1.entrySet().stream()
                    .allMatch(e -> Arrays.equals(e.getValue(), map2.get(e.getKey())));
    }
}