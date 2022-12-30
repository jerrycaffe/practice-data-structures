package com.efficion.ListExample.SinglyLinkedList;

public class SinglyLinkedList extends Node {
    public Node head;
    public Node tail;

    public SinglyLinkedList() {
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
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

    }

    /**
     * name - in js called unshift
     * accepts a value
     * step 1: create a new node using the value passed to the method
     * step 2: if there is no head, set the head and tail to be the newly created node
     * step 3: otherwise set the newly created node's next property to be the current head property on the list
     * step 4: set the head property on the list to be the newly created node
     * step 5:
     */

    public void addFirstSinglyList(int value) {
        Node newValue = new Node(value);
        if (this.head == null) {
            this.head = newValue;
            this.tail = newValue;
        } else {
            newValue.next = this.head;
            this.head = newValue;
        }
    }

    /**
     * @name get
     * @input an index
     * @returns a node
     * step 1: if the index is less than zero or if the list is empty return null
     * step 2: loop through the list by increasing the value of the counter
     * check property of the current node if it is null
     * if index is reached return the node at the specified index
     * step 3: if after looping through and no index is found return null
     */

    public int getSinglyList(int index) {
        if (index < 0 || this.head == null) return -1;
        int count = 0;
        Node current = this.head;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return -1;

    }

    /**
     * @name: set
     * @variables value and index
     * @returns previous value that was replaced
     * <p>
     * step 1: if the index is less than zero or no head return null
     * step 2: loop through the list by increasing the value of the counter
     * check property of the current node if it is null
     * if index is reached set the data property to the value passed in the specified index
     * step 4: if after looping through and no index is found return null
     */

    public Integer setSinglyList(int index, Integer value) {
        if (index < 0) return null;
        Node current = this.head;
        int count = 0;
        while (index != count && current != null) {

            count++;
            current = current.next;
        }
        if (current == null) return null;
        Integer replacedValue = current.data;
        current.data = value;
        return replacedValue;
    }

    public void displaySinglyList() {
        Node current = this.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    /**
     * step 1: if there is no node return null or empty
     * step 2: if head and tail are the same it means that is the only node so set it to null
     * step 3: else set new add to the next head
     */
    public int removeFirstSinglyList() {
        int deletedValue = -1;
        if (head == null) return deletedValue;
        deletedValue = this.head.data;
        if (head == tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = head.next;
        }
        return deletedValue;
    }

    public Node removeLast() {
        Node oldTail = tail;
        try {
            if (head == null) return null;
            Node current = head;
            Node prev = null;
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            tail = prev;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return oldTail;

    }

    public int sizeSinglyList() {
        if (head == null) return 0;
        Node current = head;
        int i = 0;
        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    /**
     * @param index
     * @param data  Step 1: if the index is less than zero return null
     *              Step 2: if the index is zero, add data to the beginning of the list
     *              Step 3: Access the node at the index of -1
     *              Step 4: Set the next property on that node to be the new node
     *              Step 5: return true
     */
    public boolean insert(int index, int data) {
        if (index < 0) return false;
        if (index == 0) {
            addFirstSinglyList(data);
            return true;
        }
        Node newNode = new Node(data);
        Node prev = this.head;
        Node current = this.head;


        int count = 0;
        while (current != null) {

            if (index == count) {
                prev.next = newNode;
                newNode.next = current;
                return true;
            }
            prev = current;
            current = current.next;
            count++;
        }
        return false;

    }

    public void emptyList() {
        if (this.head == null && this.tail == null) {
            System.out.println("Linst is emptied");
        } else {
            head = null;
            tail = null;
        }

    }

    //    13 -> 27 -> 32 -> 71
//    13 <- 27 <- 32 <- 71
//    while the next of current is not null
//    set next of current to a temp variable
//set next of current to previous
//    set current to temp
//
//
    public void reverse() {
        Node current = this.head;
        Node prev = null;
        Node temp = null;

        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        Node tempHead = this.head;
        this.head = this.tail;
        this.tail = tempHead;
    }
}
