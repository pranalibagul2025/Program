package PQ27122025;

import java.util.HashSet;

public class CheckDuplicates {
    static boolean hasDuplicate(int[] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num: arr)
        {
            if (!set.add(num))
            {
                return true;

            }

        }
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2};

        System.out.println(hasDuplicate(arr));
    }

}
