package com.efficion.ListExample.Stack;

import com.efficion.ListExample.SinglyLinkedList.SinglyLinkedList;

public class StackLinkedList {
    SinglyLinkedList linkedList;

    public StackLinkedList() {
        linkedList = new SinglyLinkedList();
    }

    //    push method
    public void push(int value) {
        linkedList.insert(0, value);
    }

    //    isEmpty method (if head points to null then it is empty)
    public boolean isEmpty() {
        return linkedList.head == null;
    }

    //    Pop
    public int pop() {
        if (isEmpty()) return -1;
        int result = linkedList.getSinglyList(0);
        linkedList.removeFirstSinglyList();
        return result;
    }

    public int peek() {
        if (isEmpty()) return -1;
        return linkedList.getSinglyList(0);
    }

    public void delete() {
        if (!isEmpty()) {
            linkedList.emptyList();
        }
        System.out.println("Stack deleted");
    }
}
