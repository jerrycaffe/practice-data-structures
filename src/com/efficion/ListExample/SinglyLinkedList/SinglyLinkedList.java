package com.efficion.ListExample.SinglyLinkedList;

public class SinglyLinkedList extends Node {
    private Node head;
    private Node tail;

    SinglyLinkedList() {
        super(0);
        this.head = null;
        this.tail = null;
    }

    /**
     * @param data
     * @returns nothing
     * <p>
     * Step 1: if there is nothing in the list (check the head for null)
     * create head
     * add data to head
     * head should point to tail
     * Step 2: else add data to tail
     * set the current addition to tail
     */
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;

        }else this.tail.next = newNode;
    }

    public void displayList(){
        if(this.head == null) System.out.println("empty list");
        Node current = this.head;
        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }
    }

}
