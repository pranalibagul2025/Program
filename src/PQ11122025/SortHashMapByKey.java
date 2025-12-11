package PQ11122025;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapByKey {
    public static void main(String[]args)
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(3,"mango");
        map.put(6,"cherry");
        map.put(9,"bitroot");

        TreeMap<Integer,String> sortedmap = new TreeMap<>();
        for(Map.Entry<Integer,String> entry : sortedmap.entrySet())
        {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

    }
}
