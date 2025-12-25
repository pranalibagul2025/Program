package PQ11122025;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main (String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(77);
        queue.add(20);
        queue.add(81);
        queue.add(12);
        queue.add(67);

        System.out.println("Queue after editing:"+queue);
        int removed = queue.remove();
        System.out.println("Removed element:"+removed);
        System.out.println("Queue after remove:"+ queue);
        System.out.println("front element:"+ queue.peek());
    }
}
