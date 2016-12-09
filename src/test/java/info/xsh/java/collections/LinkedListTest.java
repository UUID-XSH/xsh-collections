package info.xsh.java.collections;

import info.xsh.java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by xiaohuo on 16/12/8.
 */
public class LinkedListTest {

    @Test
    public void addTest() {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Iterator<String> iterator = list.iterator();
        Assert.assertTrue(list.size() == 3);
        Assert.assertTrue("three".equals(list.peek()));
    }

    @Test
    public void addLastTest() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        Assert.assertTrue(list.size() == 3);
        Assert.assertTrue("one".equals(list.peek()));
    }

    @Test
    public void remove() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        list.remove();
        Assert.assertTrue(list.size() == 2);
        Assert.assertTrue("two".equals(list.peek()));
    }

    @Test
    public void removeLast() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        list.removeLast();
        Assert.assertTrue(list.size() == 2);
        Assert.assertTrue("one".equals(list.peek()));

    }
}
