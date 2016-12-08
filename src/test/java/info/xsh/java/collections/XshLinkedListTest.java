package info.xsh.java.collections;

import org.junit.Test;

/**
 * Created by xiaohuo on 16/12/8.
 */
public class XshLinkedListTest {
    @Test
    public void addTest() {
        List<String> list = new LinkedList<>();
        list.addLast("one");
        list.addLast("two");
        list.addLast("three");
    }
}
