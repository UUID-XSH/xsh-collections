package info.xsh.java.collections;

import java.util.Iterator;

/**
 * Created by xiaohuo on 16/12/6.
 */
public class XshResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] items = (Item[]) new Object[1];  //items
    private int N = 0; //   numbers of items

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    /**
     * add item to top of stack
     *
     * @param item
     */
    public void push(Item item) {
        if (N == items.length)
            resize(2 * items.length);
        items[N++] = item;
    }

    public Item pop() {
        Item toReturn = items[--N];
        if (N > 0 && N == items.length / 4)
            resize(items.length / 2);
        return toReturn;
    }

    @Override public Iterator<Item> iterator() {
        return new Iterator<Item>() {

            private int i = N;

            @Override public boolean hasNext() {
                return i > 0;
            }

            @Override public Item next() {
                return items[i--];
            }

            @Override public void remove() {

            }
        };
    }

    private void resize(int max) {
        Item[] newItems = (Item[]) new Object[max];
        for (int i = 0; i < N; i++) {
            newItems[i] = items[i];
        }
        items = newItems;
    }
}

