package PQ11122025;

import java.util.HashMap;
import java.util.Map;

public class IterateHashMap {
    public static void main ( String[] args)
    {
        HashMap<Integer,String> map =  new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Orange");

        for (Map.Entry<Integer,String> entry : map.entrySet())
            {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }

    }
}
