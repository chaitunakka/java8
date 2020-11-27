package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MyDictionary {
    private Map<String, String> wordMap = new HashMap<>();

    public void add(String word, String meaning) {
        this.wordMap.put(word, meaning);
    }

    public String getMeaning(String word) {
        return this.wordMap.get(word);
    }
}
