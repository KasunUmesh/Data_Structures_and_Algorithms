package org.example.stack;

public class Stack {
    private int[] elementData;
    private int top; // Points to the top of the stack

    public Stack(int intialCapacity) {
        elementData = new int[intialCapacity];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            grow();
        }
        elementData[++top] = data;
    }

    public int peek() {
        return elementData[top];
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return elementData[top--];
    }

    public boolean isFull() {
        return top == elementData.length -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void grow() {
        int[] temp = elementData;

        elementData = new int[elementData.length * 2];
        for (int i = 0; i < temp.length; i++) {
            elementData[i] = temp[i];
        }
    }

    public void printStack() {
        System.out.print("[");
        for (int i = 0; i<= top; i++) {
            System.out.print(elementData[i] + ", ");
        }
        System.out.println("\b\b]");
    }
}
