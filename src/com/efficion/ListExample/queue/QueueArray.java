package com.efficion.ListExample.queue;


public class QueueArray {
    int[] arr;
//    Top of queue is the end of queue
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
    }

    public boolean isFull() {
        return topOfQueue == arr.length - 1;
    }

    public boolean isEmpty() {
        return beginningOfQueue == -1 || beginningOfQueue == arr.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is filled");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;

        } else {
            topOfQueue++;
            arr[topOfQueue] = value;

        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > topOfQueue) {
                beginningOfQueue = -1;
                topOfQueue = -1;
            }
            return result;
        }

    }

    public int peek() {
        return isEmpty() ? -1 : arr[beginningOfQueue];
    }

    public void deleteQueue(){
        arr = null;
        beginningOfQueue = -1;
        topOfQueue = -1;
    }
}
