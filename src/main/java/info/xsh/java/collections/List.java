package info.xsh.java.collections;

import info.xsh.java.util.Iterable;

import java.util.Collection;

/**
 * Created by xiaohuo on 16/12/6.
 */
public interface List<Item> extends Iterable<Item> {
    void addFirst(Item item);

    void addLast(Item item);

    Item removeFirst();

    Item removeLast();

    void add(Item item);

    Item remove();

    Item peek();

    int size();

    boolean isEmpty();

    Item get(int insex);

    boolean contains(Object o);

    boolean addAll(Collection<? extends Item> c);

    boolean addAll(int size, Collection<? extends Item> c);

    Item set(int index, Item element);

    Item remove(int index);

    int indexOf(Object o);

    int lastIndexOf(Object o);
}
