package org.iesfm.datastructures;

import java.util.Objects;

public class Nodo {
    // Nodo(1, Nodo(2, Nodo(3, Nodo(4, null))))

    private Nodo next;
    private int value;

    public Nodo(Nodo next, int value) {
        this.next = next;
        this.value = value;
    }

    // last (1)
    //      -> last (2)
    //                -> last (3)
    //                          -> last (4)
    //                          -> 4
    //                -> 4
    //      -> 4
    // 4
    public Integer last() {
        if(next == null) {
            return value;
        } else {
            return next.last();
        }
    }

    public Nodo(int value) {
        this(null, value);
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return value == nodo.value && Objects.equals(next, nodo.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, value);
    }

    public void add(int value) {
        if(next == null) {
            next = new Nodo(value);
        } else {
            next.add(value);
        }
    }
}
