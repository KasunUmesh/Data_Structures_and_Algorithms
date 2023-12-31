package org.example.linkedlist;

public class LinkedList {
    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node head;

    public void insertAtBeginning(int data) {
        Node node = new Node(data);

        node.next = head;
        head = node;
    }

    public void insertAtEnd(int data) {
        if(head == null) {
            insertAtBeginning(data);
            return;
        }

        Node node = new Node(data);

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
    }


    public void traverse() {
        Node temp = head;

        System.out.print("[");
        while (temp.next != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println("\b\b]");
    }

    public void insertPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node node = new Node(data);

        Node temp = head;
        for (int i = 0; i < position -1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteBeginning() {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }

        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    public void deletePosition(int position) {
        if (head == null) {
            System.err.println("List is empty");
            return;
        }

        if (position == 0 ) {
            deleteBeginning();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position -1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
    }

    public int size() {
        int count = 0;

        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public int get(int position) {
        if (head == null) {
            System.err.println("List is empty");
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
