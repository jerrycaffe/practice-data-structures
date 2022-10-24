package dsLinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;
    private Node tail;

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
     *          check property of the current node if it is null
     *          if index is reached return the node at the specified index
     * step 3: if after looping through and no index is found return null
     */

    public Node getSinglyList(int index) {
        if (index < 0 || this.head == null) return null;
        int count = 0;
        Node current = this.head;
        while (current != null) {
            if (count == index) {
                return current;
            }
            count++;
            current = current.next;
        }
        return null;

    }

    /**
     * @name: set
     * @variables value and index
     * @returns previous value that was replaced
     *
     * step 1: if the index is less than zero or no head return null
     * step 2: loop through the list by increasing the value of the counter
     *          check property of the current node if it is null
     *          if index is reached set the data property to the value passed in the specified index
     * step 4: if after looping through and no index is found return null
     */

    public Integer setSinglyList(int index, Integer value){
        if(index < 0) return null;
        Node current = this.head;
        int count = 0;
        while(index != count && current != null){

            count++;
            current = current.next;
        }
        if(current == null) return null;
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
    public void removeFirstSinglyList() {
        if (head == null) return;
        if (head == tail) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = head.next;
        }
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


}

public class DsSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(100);
        sll.add(90);
        sll.add(70);
        sll.add(60);
        sll.add(10);
        sll.add(20);
//        sll.addFirstSinglyList(190);


//        System.out.println(sll.removeLast().data);
//        System.out.println(sll.removeLast().data);
//        System.out.println(sll.removeLast().data);
//        System.out.println("=================================");
//        sll.removeFirstSinglyList();
//        sll.displaySinglyList();
//        System.out.println(sll.getSinglyList(100));

        System.out.println(sll.setSinglyList(-1, 560));
        System.out.println("=================================");
        sll.displaySinglyList();

    }
}
