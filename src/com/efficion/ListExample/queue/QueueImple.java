package com.efficion.ListExample.queue;

public class QueueImple {
    public static void main(String[] args) {
        CircularArrayQueue cqa = new CircularArrayQueue(3);

        System.out.println(cqa.isFull());
    }
}
