package PQDate10122025;

import java.util.HashSet;

public class StudentHashSet {
    public static void main(String[] args)
    {
        HashSet<String> Students = new HashSet<>();

        //Add student names
        Students.add("Pranuu");
        Students.add("Pradnya"); // duplicate → ignored
        Students.add("Priya");
        Students.add("Pooja");
        Students.add("Poonam");

        System.out.println("Student names:");
        for (String names : Students);     // Print the HashSet
        {
            System.out.println("name");
        }

    }
}
