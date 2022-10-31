package com.efficion.ListExample.DoublyLinkedList;

public class Node {
    protected int data;
    protected Node prev;
    protected Node next;
    Node(int data){
       this.data = data;
       this.prev = null;
       this.next = null;
    }
}
