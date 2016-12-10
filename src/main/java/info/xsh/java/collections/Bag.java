package info.xsh.java.collections;

import info.xsh.java.util.Iterable;
import info.xsh.java.util.Iterator;

/**
 * Created by xiaohuo on 16/12/10.
 */
public class Bag<T> implements Iterable<T> {
    private LinkedList<T> list = new LinkedList<T>();

    public void add(T t) {
        list.add(t);
    }


    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
