package com.company;

public class MyStrQueueLinkList<T>{

    private class ListLinked {
        public T value;
        public ListLinked next;
        public ListLinked prev;

        public ListLinked(T value, ListLinked next, ListLinked prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


    }

    protected ListLinked head = null;
    protected ListLinked tail = null;
    protected int size = 0;

    public void add(T elem) {
        ListLinked temp = new ListLinked(elem, null, tail);
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
            for (ListLinked curr = head; ; curr = curr.next) {
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

    public void reverseListQueue() {
        ListLinked curr = head;
        ListLinked freeVar;
        while (curr.next != null) {
            if (curr.next == tail) {
                freeVar = head;
               head = tail;
               tail = freeVar;
            }
            curr = curr.next;
        }

        ListLinked temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.prev;
        }


    }

    public void printQueue() {
        ListLinked temp = head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
