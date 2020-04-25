package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestGet {
    @Test
    public void testGet_1() throws Exception {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<>();
        list.add("hello");
        list.add("there");
        list.get(1);
        list.get(0);
        Assert.assertEquals(list.get(1), "there");
        Assert.assertEquals(list.get(0), "hello");
    }

    @Test
    public void testGet_2() throws Exception {
        try {
            MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
            list.get(0);
        } catch (IndexException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }
}
