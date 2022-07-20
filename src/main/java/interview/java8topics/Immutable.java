package com.java8topics;

import java.util.HashMap;
import java.util.Map;

public final class Immutable {

    private String message;

    // Member attributes of final class
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;

    private final Map<String, String> shallowCopyMap;

    // Constructor of immutable class
    // Parameterized constructor
    public Immutable(String name, int regNo,
                   Map<String, String> metadata,
                     Map<String, String> shallowCopyMap )
    {

        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;

        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
        this.shallowCopyMap=shallowCopyMap;
    }

    // Method 1
    public String getName() { return name; }

    // Method 2
    public int getRegNo() { return regNo; }

    // Note that there should not be any setters

    // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata()
    {

        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    public Map<String, String> getShallowCopyMap()
    {
        return this.shallowCopyMap;
    }


    public static void main(String[] args)
    {

        // Creating Map object with reference to HashMap
        Map<String, String> map = new HashMap<>();

        // Adding elements to Map object
        // using put() method
        map.put("1", "first");
        map.put("2", "second");

        Map<String, String> shallowMap = new HashMap<>();
        shallowMap.put("1", "first");
        shallowMap.put("2", "second");

        Immutable s = new Immutable("ABC", 101, map , shallowMap);

        // Calling the above methods 1,2,3 of class1
        // inside main() method in class2 and
        // executing the print statement over them
        System.out.println(s.getName());
        System.out.println(s.getRegNo());
        System.out.println(s.getMetadata());
        System.out.println(s.getShallowCopyMap());


        // Uncommenting below line causes error
        //s.regNo = 102;

        map.put("3", "third");
        shallowMap.put("3", "third");

        // Remains unchanged due to deep copy in constructor
        System.out.println(s.getMetadata());
        System.out.println(s.getShallowCopyMap());

        s.getMetadata().put("4", "fourth");
        shallowMap.put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(s.getMetadata());
        System.out.println(s.getShallowCopyMap());

    }
}
