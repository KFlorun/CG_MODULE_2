package ss10_dsa_list_set.Thuc_Hanh.MyArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public void add(int index, E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        for (int i = index; i < size ; i++) {
            elements[i] = elements[i + 1];
        }
        elements[index] = e;
    }

    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size );
        }
        return (E) elements[i];
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Unavailable index " + index);
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return (E) elements;
    }

    public int size() {
        return size;
    }

    //public E clone() {}

    public boolean contain(E o) {
        for (Object ele: elements) {
            if (ele == o) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        int count = 0;
        for (Object ele: elements) {
            if (ele != o) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            remove(i);
        }
    }

}
