package org.example.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int peek = stack.peek();
        System.out.println("Peek: " + stack.peek());

        stack.push(40);
        System.out.println("Peek: " + stack.peek());

        stack.push(50);
        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        stack.printStack();

        stack.push(400);

        stack.printStack();

        stack.push(500);
        stack.printStack();

        stack.push(600);
        stack.printStack();

        stack.push(700);
        stack.printStack();

        System.out.println("size: " + stack.size());

        System.out.println("Popped: " + stack.pop());

        System.out.println("size: " + stack.size());

    }
}
