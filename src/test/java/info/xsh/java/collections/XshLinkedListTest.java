package info.xsh.java.collections;

import info.xsh.java.util.Iterator;
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
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
