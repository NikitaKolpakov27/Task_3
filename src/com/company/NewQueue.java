package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class NewQueue {

    String[] newArray(String[] array) {
        String[] newArr = new String[array.length];
        Queue<String> queue = new LinkedList<>(Arrays.asList(array));

        for (int i = array.length-1; i >= 0; i--) {
            newArr[i] = queue.poll();
        }
        return newArr;
    }
}

