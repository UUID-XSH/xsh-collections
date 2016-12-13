package info.xsh.java.collections;

import info.xsh.java.util.Iterator;

import java.util.Collection;

/**
 * Created by xiaohuo on 16/12/6.
 */
public class LinkedList<T> implements List<T> {

    private transient Node<T> first;
    private transient Node<T> last;
    private int length;

    @Override
    public void addFirst(T t) {
        Node<T> node = new Node<>(t);
        if (first == null) {
            last = node;
            node.next = null;
        } else {
            first.previous = node;
            node.next = first;
        }
        first = node;
        length++;
    }

    @Override
    public void addLast(T t) {
        Node<T> node = new Node<>(t);
        if (last == null) {
            first = node;
            node.previous = null;
        } else {
            last.next = node;
            node.previous = last;
        }
        last = node;
        length++;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }
        T t = first.getItem();
        if (first.next == null)
            last = null;
        first = first.next;
        length--;
        return t;
    }

    @Override
    public T removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("list is empty");
        }

        T t = last.getItem();
        if (last.previous == null)
            first = null;
        last = last.previous;
        length--;
        return t;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return node(index).item;
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);
        Node<T> x = node(index);
        T old = x.item;
        x.item = element;
        return old;
    }

    @Override
    public T remove(int index) {
        return removeFirst();
    }

    Node<T> node(int index) {
        if (index < (length >> 1)) {
            Node<T> x = first;
            for (int i = 0; i < index; i++)
                x = x.next;
            return x;
        } else {
            Node<T> x = last;
            for (int i = length - 1; i > index; i--)
                x = x.previous;
            return x;
        }
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = length;
        if (o == null) {
            for (Node<T> x = last; x != null; x = x.previous) {
                index--;
                if (x.item == null)
                    return index;
            }
        } else {
            for (Node<T> x = last; x != null; x = x.previous) {
                index--;
                if (o.equals(x.item))
                    return index;
            }
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(indexExceptionMsg(index));
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(indexExceptionMsg(index));
    }

    private String indexExceptionMsg(int index) {
        return "Index: " + index + ", Length: " + length;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < length;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= length;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return addAll(length, c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        checkPositionIndex(index);

        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return false;

        Node<T> pred, succ;
        if (index == length) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.previous;
        }

        for (Object o : a) {
            T e = (T) o;
            Node<T> newNode = new Node<>(pred, e, null);
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.previous = pred;
        }

        length += numNew;
        return true;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<T> x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node<T> x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    @Override
    public void add(T t) {
        this.addFirst(t);
    }

    @Override
    public T remove() {
        return this.removeFirst();
    }

    @Override
    public T peek() {
        return first == null ? null : first.getItem();
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node<T> cursor = first;

            @Override
            public T next() {
                T node = cursor.getItem();
                cursor = cursor.next;
                return node;
            }

            @Override
            public boolean hasNext() {
                return cursor != null;
            }
        };
    }

    private class Node<Item> {
        Item item;
        Node<Item> next;
        Node<Item> previous;

        Node() {

        }

        Node(Node<Item> prev, Item element, Node<Item> next) {
            this.item = element;
            this.next = next;
            this.previous = prev;
        }

        Node(Item item) {
            this.item = item;
        }

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }
    }
}
