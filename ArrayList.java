//@author Alex Skiles
import java.util.Iterator;

public class ArrayList<T> implements List<T> {
    private T[] items;
    private int size;

    public ArrayList() {
        size = 0;
        items = (T[]) new Object[1];
    }

    @Override
    public void add(T item) {
        if (size == items.length) {
            resize(2 * items.length);
        }
        items[size++] = item;
    }

    private void resize(int capacity) {
        T[] temp = (T[]) new Object[capacity];
        for (int i = 0; i < size; ++i) {
            temp[i] = items[i];
        }
        items = temp;
    }

    public void clear() {
        T[] items = (T[]) new Object[1];
        size=0;
    }

    public boolean contains(T item) {
        int i;
        for (i=0; i<size; i+=1){
            if (items[i]==item) return true;
        }
        return false;
    }

    public T get(int i) {
        return items[i];
    }

    public int indexOf(T item) {
        int i;
        for (i=0; i<size; i+=1){
        if (items[i]==item)
            return i;
        }
        return -1;
    }

    public void removeAt(int i) {
        while (i < size - 1) {
            items[i] = items[i + 1];
            i += 1;
        }
        size = size - 1;
        if (size > 0 && size < items.length/4) resize(items.length/2);
    }

    public void set(int i, T item) {
        items[i] = item;
    }

    public int size() {
        return size;
        //return items.length-1
    }

    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        int i = 0;

        @Override
        public boolean hasNext() {
            return i < size;
        }

        @Override
        public T next() {
            return items[i++];
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArrayList that = (ArrayList) o;
        if (this.size != that.size) return false;
        for (int i = 0; i < size; i++) {
            if (!items[i].equals(that.items[i])) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        assert size > 0;
        String str = "[" + items[0];
        for (int i = 1; i < size; i=i+1) {
            str += ", " + items[i];
        }
        return str + "]";
    }
}
