package PQ27122025;

import java.util.HashMap;
import java.util.Map;
public class FindDuplicateElement {
    public static void maim(String[] args)
    {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        HashMap<Integer, Integer> map = new HashMap<>();
                for (int num : arr)
                {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }

        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }

}
