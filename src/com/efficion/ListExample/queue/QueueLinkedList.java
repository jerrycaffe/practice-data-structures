package com.efficion.ListExample.queue;

import com.efficion.ListExample.SinglyLinkedList.SinglyLinkedList;

public class QueueLinkedList {
    SinglyLinkedList singlyLinkedList;


    public QueueLinkedList() {
        singlyLinkedList = new SinglyLinkedList();
    }

    private boolean isEmpty() {
        return singlyLinkedList.head == null;
    }

    public void enqueue(int value) {
        singlyLinkedList.add(value);
        System.out.println("added successfully");
    }

    public int deQueue() {
        int value = -1;
        if (isEmpty()) return value;

        return singlyLinkedList.removeFirstSinglyList();
    }

    public int peek() {
        return singlyLinkedList.getSinglyList(0);
    }

    public void deleteQueue(){
        singlyLinkedList.emptyList();
        System.out.println("queue emptied");
    }
}
