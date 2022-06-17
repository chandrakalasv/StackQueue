package com.bridge.stackqueue;

public class LinkedList<T> {
    Node top;

    public void add(T data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        Node temp = top;
        top = temp.next;
        return (int) temp.data;
    }

    @Override
    public String toString() {
        return "top=" + top +
                '}';
    }
}
