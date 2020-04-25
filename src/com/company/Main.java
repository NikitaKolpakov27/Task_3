package com.company;

import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) throws Exception {
        String[] array = {"hello", "everyone", "alex", "lion"};

        NewQueue newQueue = new NewQueue();

        for (String s : array) {
            System.out.println(s);
        }

        System.out.println();

        String[] array1 = newQueue.newArray(array);

        for (String s : array1) {
            System.out.println(s);
        }

        System.out.println();


        MyStrQueueLinkList<String> quelist = new MyStrQueueLinkList<String>();
        quelist.add("hello");
        quelist.add("Annie");
        quelist.add("what you're doing?");
        quelist.toArray();
        for (int i = 0; i < quelist.size; i++) {
            System.out.println(quelist.get(i));
        }

        System.out.println();

        for (int i = quelist.size-1; i >= 0; i--) {
            System.out.println(quelist.get(i));
        }






    }

}
