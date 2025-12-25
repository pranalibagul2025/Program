package PQDate10122025;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i <10 ; i++)
        {
            list.add(i);
        }
        System.out.println("ArrayList Elements:");
        for (int num : list)
        {
            System.out.println(num);

        }

    }

}
