package com.company;

public class MyStrQueueLinkList<T>{

    private class Node {
        public String value;
        public Node next;
        public Node prev;

        public Node(String value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


    }

    protected Node head = null;
    protected Node tail = null;
    protected int size = 0;

    public void add(String elem) {
        Node temp = new Node(elem, null, tail);
        if (tail == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public void removeLast() {
        checkEmpty();
        if (size == 1) {
            head = tail = null;
        } else {
            for (Node curr = head; ; curr = curr.next) {
                if (curr.next.next == null) {
                    tail = curr;
                    tail.next = null;
                    break;
                }
            }
        }
        size--;
    }

    public boolean checkEmpty() {
        return head == null;
    }


    String[] toArray() {
        String[] array = new String[size];
        Node list = head;

        for (int i = 0; list != null; i++) {
            array[i] = (String) list.value;
            list = list.next;
        }

        return array;

    }

    int size() {
        return size;
    }

    public String get(int index) throws Exception {
        if (index < 0 || index > size - 1) {
            throw new IndexException("Incorrect! Index is an invalid range!");
        }
        Node curr = head;
        while (index != 0) {
            index--;
            curr = curr.next;
        }
        return curr.value;
    }

    String getHeadValue() {
        return head.value;
    }

    String getTailValue() {
        return tail.value;
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }

}
