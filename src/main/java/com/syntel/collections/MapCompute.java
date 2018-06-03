package com.syntel.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * MapCompute
 */
public class MapCompute {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.compute("key", (k,v) -> k.length());
        map.computeIfAbsent("key1", String::length);
        map.computeIfAbsent("key", String::length);
        map.computeIfPresent("key", (k,v) -> k.length());
        
        map.forEach((k, v) -> System.out.println(k+" <-> "+v));
    }

}
