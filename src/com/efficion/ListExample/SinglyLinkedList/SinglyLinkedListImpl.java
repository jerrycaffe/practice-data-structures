package com.efficion.ListExample.SinglyLinkedList;

public class SinglyLinkedListImpl {
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(13);
        sll.add(27);
        sll.add(32);
        sll.add(71);

//        sll.insert(1, 300);
//        System.out.println(sll.getSinglyList(2));
        sll.reverse();

//        sll.displaySinglyList();
    }

}
