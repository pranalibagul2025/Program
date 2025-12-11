package PQDate10122025;



import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListDecs {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(3);
        list.add(6);

        //Collections.sort(list, Collections.reverseOrder());
        Collections.sort(list, Collections.reverseOrder());

        System.out.println("Sorted List (Descending): "+list);

    }
}
