/**
 *  Java program to create, update, and delete HashMap instance.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Map<String, Integer> myMap = new HashMap<>();

        // Add.
        myMap.put("2", 2);
        myMap.put("3", 3);
        myMap.put("1", 1);
        myMap.put("8", 8);
        myMap.put("5", 5);
        myMap.put("4", 4);

        // Read.
        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry);
        }

        // Update.
        myMap.put("6", 6);
        myMap.put("7", 7);

        // Read.
        myMap.entrySet().forEach(System.out::println);

        // Delete.
        myMap.clear();

    }
}