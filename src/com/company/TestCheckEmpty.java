package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestCheckEmpty {
    @Test
    public void testCheckFalse() {
        MyStrQueueLinkList<String> listFalse = new MyStrQueueLinkList<String>();
        listFalse.add("Hello");
        boolean result = listFalse.checkEmpty();
        Assert.assertFalse(result);

    }

    @Test
    public void testCheckTrue() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        boolean result = list.checkEmpty();
        Assert.assertTrue(result);
    }
}
