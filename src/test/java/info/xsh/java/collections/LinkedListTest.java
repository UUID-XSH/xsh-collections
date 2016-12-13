package info.xsh.java.collections;

import info.xsh.java.util.Iterator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void getTest() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        Assert.assertTrue(list.get(1) == "two");
        Assert.assertTrue("one".equals(list.peek()));
    }

    @Test
    public void containsTest() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        Assert.assertTrue(list.contains("three"));
    }

    @Test
    public void addAllTest() {
        java.util.List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        List<String> list1 = new LinkedList<>();
        list1.addAll(list);
        Assert.assertTrue(list1.contains("one"));
        Assert.assertTrue(list1.contains("two"));
        Assert.assertTrue(list1.contains("three"));
    }

    @Test
    public void setTest() {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.set(0,"hi");
        Assert.assertTrue(list.contains("hi"));
        Assert.assertTrue("hi".equals(list.peek()));
    }

    @Test
    public void removeTest(){
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
        list.remove(1);
        Assert.assertTrue(!list.contains("one"));
        Assert.assertTrue("two".equals(list.peek()));
    }
}
