package PQDate10122025;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(70);

        Collections.reverse(list);
        System.out.println("Reverse List:"+list);

    }
}
