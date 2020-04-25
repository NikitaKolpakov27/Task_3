package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestRemoveLast {
    @Test
    public void testRemoveLast_1() throws Exception {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("hollow");
        list.add("hello");
        list.add("world");
        list.removeLast();
        Assert.assertEquals("hello", list.getTailValue());
        Assert.assertEquals(2, list.size);
    }

    @Test
    public void testRemoveLast_2() throws Exception {
        try {
            MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
            list.removeLast();
        } catch (NullPointerException thrown) {
            Assert.assertNotEquals("", thrown.getMessage());
        }
    }

    @Test
    public void testRemoveLast_3() throws Exception {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("hello");
        list.removeLast();
        Assert.assertSame(list.getHead(), list.getTail());
        Assert.assertNull(list.getHead());
        Assert.assertNull(list.getTail());
        Assert.assertEquals(0, list.size());
    }
}
