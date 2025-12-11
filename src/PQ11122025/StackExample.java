package PQ11122025;

import java.util.Stack;

public class StackExample {
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(45);
        stack.push(36);
        stack.push(68);
        stack.push(95);
        stack.push(58);

        System.out.println("stack after push:"+ stack);

        int poppedelement = stack.pop();
        System.out.println("Popped element:"+ poppedelement);
        System.out.println("Stack after pop:"+ stack);
        System.out.println("Top element:"+ stack.peek());


    }
}
//push() → adds element on top
//
//pop() → removes and returns top element
//
//peek() → returns top element without removing
//
//Stack follows LIFO (Last In, First Out)