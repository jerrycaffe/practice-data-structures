package com.efficion.ListExample.Stack;

/**
 * Stack can be implemented using array or linked list
 * Advantage using array is that it is easy to implement but array has a fixed size
 * Advantage using linked list is that it has variable sizes but it is not easy to implement
 */
public class StackArray {
    int[] arr;
    int topOfStack;

    public StackArray(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("Stack is created with the size of " + size);
    }

    //    isEMpty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    //    isFUll
    public boolean isFull() {
        return this.arr.length == topOfStack + 1;
    }

    //    push
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full");

        } else {
            this.arr[topOfStack + 1] = value;
            topOfStack++;
        }
    }

    public int pop() {
        if (isEmpty()) return -1;
        int topStack = arr[topOfStack];
        topOfStack--;
        return topStack;
    }

    //    peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek empty stack");
            return -1;
        }
        return arr[topOfStack];
    }
//    Delete method
    public void deleteStack(){
        topOfStack =-1;
        arr = null;
    }

}
