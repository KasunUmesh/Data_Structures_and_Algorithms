package org.example.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(500);

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);

        list.insertAtEnd(40);

        list.traverse();

        list.insertPosition(50, 2);

        list.traverse();

        list.deleteBeginning();

        list.traverse();

        list.deleteAtEnd();

        list.traverse();

        list.deletePosition(2);

        list.traverse();

        System.out.println("Size:" + list.size());

        System.out.println("Get (2): "  + list.get(2));
    }
}
