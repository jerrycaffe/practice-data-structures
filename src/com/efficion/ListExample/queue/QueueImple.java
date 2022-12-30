package com.efficion.ListExample.queue;

public class QueueImple {
    public static void main(String[] args) {
        QueueLinkedList qll = new QueueLinkedList();

        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.deleteQueue();
        System.out.println(qll.deQueue());

    }
}
