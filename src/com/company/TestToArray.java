package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TestToArray {
    @Test
    public void testToArray() {
        MyStrQueueLinkList<String> list = new MyStrQueueLinkList<String>();
        String[] array = {"hello", "there", "my", "good", "too"};
        list.add("hello");
        list.add("there");
        list.add("my");
        list.add("good");
        list.add("too");
        Assert.assertArrayEquals(list.toArray(), array);
    }
}
