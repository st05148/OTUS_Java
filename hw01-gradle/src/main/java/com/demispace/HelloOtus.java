package com.demispace;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class HelloOtus {
    public static void main(String[] args) {
        Map<String,String> items = ImmutableMap.of("key1", "entry1", "key2", "entry2", "key3", "entry3");
        items.entrySet().forEach(System.out::println);
    }
}
