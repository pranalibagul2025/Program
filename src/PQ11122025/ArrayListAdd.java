package PQ11122025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAdd {
    public static void main(String[] args)
    {
        String[] array = {"P", "R", "A", "N", };

        List<String> list= new ArrayList<>(Arrays.asList(array));
        list.add("u");
        System.out.println("list");
    }
}
