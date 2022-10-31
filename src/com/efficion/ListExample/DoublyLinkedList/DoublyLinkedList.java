package com.efficion.ListExample.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private int data;
    private Node tail;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Add in doubly linked list
     * Step 1: create a new node with the value passed to the function
     * Step 2: if the head property is null set the head and tail to be the newly created node
     * Step 3: else set the previous property on the newly created node to be the tail
     * Step 4: set the next of the old tail to be the newly created node
     * Step 5: set the tail to be the newly created node
     */

    public void add(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {

            Node oldTail = this.tail;
            oldTail.next = newNode;
            newNode.prev = oldTail;
            this.tail = newNode;
        }
    }

    /**
     * Remove the tail and set the previous before tail to be the new tail
     * Step 1: if there is no head, return null
     * Step 2: store the current tail in a variable to return later
     * Step 3: if the length is 1, set the head and tail to be null
     * Step 4: update the tail to be the previous Node
     * Step 5: set the newTail next to null
     * Step 6: return value removed
     *
     * @return
     */
    public Integer removeLast() {
        if (this.head == null) {
            return null;
        }
        int data = this.tail.data;
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                this.head = null;
                this.tail = null;
            }
            current = current.next;
        }
        return data;
    }

    /**
     * Shift removes the node from the beginning and it is called removeFirst in java
     * Step 1: if head is null return null
     * Step 2: store the current head property in a variable
     * Step 3: if the length is one
     * set the head to be null
     * set the tail to be null
     * Step 4: update the head to be the next of the old head
     * Step 5: set the head prev property to be null
     * Step 6: set the old heads next to null
     * Step 7: Decrement the length
     * Step 8: return old head data
     */
    public Integer removeFirst() {
        if (this.head == null) return null;
        Node currentHead = this.head;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            this.head = currentHead.next;
            this.head.prev = null;
            currentHead.next = null;
        }
        return currentHead.data;
    }

    /**
     * Unshift add node to the beginning of the list called addFirst
     * Step 1: create a new node with the value passed to the function
     * Step 2: if the length is 0
     * set the head to be the new node
     * set the tail to be the new node
     * Otherwise
     * Step 3: set the prev property on the new node to be the head property
     * Step 4:se the next property on the new node to be the head property
     * Step 5: update the head to be the new node
     * Step 6: increment the length
     * Step 7: return the list
     */

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            Node oldHead = this.head;
            oldHead.prev = newNode;
            newNode.next = oldHead;
            this.head = newNode;
        }
    }

    public void display() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
