package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class TaskQueue {

    private static Queue<String> reverseQueue(Queue<String> firstQueue, Queue<String> secondQueue) {
        if (!(firstQueue.isEmpty())) {
            String element = firstQueue.poll();
            reverseQueue(firstQueue, secondQueue);
            secondQueue.add(element);
        }
        return secondQueue;
    }

    public static Queue<String> newQueue(Queue<String> firstQueue) {
        Queue<String> secondQueue = new LinkedList<>();
        return reverseQueue(firstQueue, secondQueue);
    }
}

