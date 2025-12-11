package PQDate10122025;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args)
    {
        HashMap<Integer,String> map = new HashMap<>();


        // Create HashMap
        map.put(1,"abc");
        map.put(2,"opq");
        map.put(3,"tfg");
        map.put(4,"zyx");
        map.put(5,"xyz");


        // Adding a duplicate key → previous value replaced
        map.put(2,"opq");

        System.out.println("Student with key 1: " + map.get(1));
        System.out.println("Student with key 2: " + map.get(2));//If key doesn't exist → returns null
        System.out.println("student with key 3: " + map.get(3));
        System.out.println("Student with key 4: " + map.get(4));
        System.out.println("Student with key 5: " + map.get(5));


        System.out.println("Student with key 10: " + map.get(10));// If key doesn't exist → returns null

    }
}



//
//put(key, value) → inserts or updates key-value pairs
//
//get(key) → returns value for the key
//
//If key doesn’t exist → get() returns null
//
//Duplicate keys overwrite the previous value