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
    public boolean isFull(){
        if(topOfQueue+1 == beginningOfQueue){
            return true;
        }else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }else {

            return true;
        }
    }
}
