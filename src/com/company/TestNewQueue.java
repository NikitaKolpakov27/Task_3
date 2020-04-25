package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TestNewQueue {
    @Test
    public void testNewQueue() {
        NewQueue newQueue = new NewQueue();
        String[] array = {"hello", "there", "hi", "everyone"};
        String[] array1 = newQueue.newArray(array);
        Assert.assertFalse(Arrays.equals(array, array1));
    }
}
