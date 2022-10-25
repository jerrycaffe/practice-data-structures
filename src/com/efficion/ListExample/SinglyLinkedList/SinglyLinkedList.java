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
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else this.tail.next = newNode;
    }

    /**
     * @param index
     * @return int
     * <p>
     * Step 1: if there is no data return null
     * Step 2: if the index is 0 return data of head
     * Step 3: loop through and retrieve the data if found
     * Step 4: return null if not found
     */

    public Integer get(int index) {
        if (this.head == null) return null;
        if (index == 0) return head.data;
        Node current = this.head;
        int count = 0;
        while (current != null) {
            if (count == index) return current.data;
            count++;
            current = current.next;
        }
        return null;
    }

    /**
     * @return
     */
    public Integer getFirst() {
        if (head == null) return null;
        return this.head.data;

    }

    public Integer getLast() {
        if (tail == null) return null;
        return this.tail.data;
    }


    public void displayList() {
        if (this.head == null) System.out.println("empty list");
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

}
