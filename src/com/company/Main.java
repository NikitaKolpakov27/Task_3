package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        Queue<String> list = new LinkedList<String>();

        list.add("hello");
        list.add("world");
        list.add("nice");
        list.add("day");

        Queue<String> result = TaskQueue.newQueue(list);
        while (!(result.isEmpty())) {
            System.out.println(result.poll());
        }

        System.out.println();


        MyStrQueueLinkList<String> quelist = new MyStrQueueLinkList<String>();
        quelist.add("hello");
        quelist.add("Annie");
        quelist.add("what you're doing?");
        quelist.printQueue();
        System.out.println();
        quelist.reverseListQueue();





    }
}
