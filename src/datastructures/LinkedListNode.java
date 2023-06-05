package datastructures;

import java.util.Objects;

public class LinkedListNode {

    private final String data;
    private LinkedListNode next;

    public LinkedListNode(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public LinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
    }
}
