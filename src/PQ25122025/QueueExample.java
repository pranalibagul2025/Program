package PQ25122025;

import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public static void main(String[]args)
    {
        Queue<Integer> queue = new LinkedList<>();

        // Add elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue: " + queue);

        // Remove element
        System.out.println("Removed element: " + queue.remove());

        // Peek element
        System.out.println("Front element: " + queue.peek());

        System.out.println("Final Queue: " + queue);
    }
}
