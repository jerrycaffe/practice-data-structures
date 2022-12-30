package com.efficion.ListExample.queue;

public class CircularArrayQueue {
    int[] arr;
    //    Top of queue is the end of queue
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularArrayQueue(int size) {
        this.arr = new int[size];
//    Top of queue is the end of queue
        this.topOfQueue = -1;
        this.beginningOfQueue = 1;
        this.size = size;
    }

    public boolean isEmpty() {
        return topOfQueue == -1;
    }

    public boolean isFull() {
        return topOfQueue + 1 == beginningOfQueue || beginningOfQueue == 0 && topOfQueue + 1 == size;

    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");

        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[beginningOfQueue] = value;
        } else {
            if (topOfQueue + 1 == size) {
                topOfQueue = 0;
            } else {
                topOfQueue++;
            }
            arr[topOfQueue] = value;
            System.out.println("inserted success");
        }
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if (beginningOfQueue == topOfQueue) {
                topOfQueue = -1;
                beginningOfQueue = -1;
            } else if (beginningOfQueue + 1 == size) {
                beginningOfQueue = 0;
            } else {
                beginningOfQueue++;
            }
            return result;
        }
    }

    public int peek() {
        return isEmpty() ? -1 : arr[beginningOfQueue];
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("Queue deleted successfully");
    }
}
