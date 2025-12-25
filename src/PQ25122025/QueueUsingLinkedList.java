package PQ25122025;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {
    public static void main(String[]args)
    {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(77);
        queue.offer(74);
        queue.offer(96);

        System.out.println("Queue:"+ queue);

        // Peek front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue element
        System.out.println("Removed: " + queue.poll());

        // Queue after dequeue
        System.out.println("Queue after removal: " + queue);

        // Check empty
        System.out.println("Is queue empty? " + queue.isEmpty());



    }
}
