package com.efficion.ListExample.Stack;

public class StackImple {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(1);
        stack.push(2);


       stack.delete();
        System.out.println(stack.peek());


//        System.out.println(stack.isEmpty());


    }
}
