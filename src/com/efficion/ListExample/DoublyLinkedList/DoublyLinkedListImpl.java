package com.efficion.ListExample.DoublyLinkedList;

public class DoublyLinkedListImpl {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(30);
        dll.add(40);
        dll.add(200);
        dll.addFirst(500);
        dll.add(15);
        dll.addFirst(90);
        dll.display();

    }
}
