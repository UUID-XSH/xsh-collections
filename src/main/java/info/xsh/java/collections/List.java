package info.xsh.java.collections;

import info.xsh.java.util.Iterable;

/**
 * Created by xiaohuo on 16/12/6.
 */
public interface List<Item> extends Iterable<Item>{
    void addFirst(Item item);
    void addLast(Item item);
    Item removeFirst();
    Item removeLast();
    void add(Item item);
    Item remove();
    Item peek();
    int size();
    boolean isEmpty();

}
