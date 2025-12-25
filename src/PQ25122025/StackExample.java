package PQ25122025;

import java.util.Stack;

public class StackExample {
    public static void main(String[]args)
    {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peek (top element)
        System.out.println("Top element: " + stack.peek());

        // Pop element
        System.out.println("Removed: " + stack.pop());

        // Stack after pop
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

    }

}
