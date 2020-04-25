package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestAdd {
    @Test
    public void testAdd() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("hello");
        list.add("world");
        list.add("more");
        Assert.assertEquals(list.getHeadValue(), "hello");
        Assert.assertEquals(list.getTailValue(), "more");
        Assert.assertEquals(3, list.size);
    }

    @Test
    public void testAdd_2() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        list.add("joy");
        Assert.assertSame(list.getHead(), list.getTail());
    }

    @Test
    public void testAdd_3() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        Assert.assertNull(list.getHead());
    }
}
