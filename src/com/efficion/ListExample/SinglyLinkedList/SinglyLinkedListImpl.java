package com.efficion.ListExample.SinglyLinkedList;

public class SinglyLinkedListImpl {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(20);
        sll.add(30);

        sll.insert(1, 300);
        System.out.println(sll.getSinglyList(2));
//        sll.displaySinglyList();
    }
}
