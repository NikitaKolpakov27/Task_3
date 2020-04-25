package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestSize {
    @Test
    public void testSize_1() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        Assert.assertEquals(0, list.size());
    }

    @Test
    public void testSize_2() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("hello");
        Assert.assertEquals(1, list.size());
    }

    @Test
    public void testSize_3() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        Assert.assertEquals(10, list.size());
    }
}
